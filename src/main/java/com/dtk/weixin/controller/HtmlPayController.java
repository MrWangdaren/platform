package com.dtk.weixin.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dtk.platform.tools.PlatformConfig;
import com.dtk.weixin.model.PayOrderParam;
import com.dtk.weixin.model.PayOrderResult;
import com.dtk.weixin.model.PayResult;
import com.dtk.weixin.model.enums.PayOrderField;
import com.dtk.weixin.model.enums.ResultCode;
import com.dtk.weixin.utils.WeiChatUtil;
import com.dtk.weixin.wxtools.BeanUtil;
import com.dtk.weixin.wxtools.DateUtil;
import com.dtk.weixin.wxtools.EncryptUtil;
import com.dtk.weixin.wxtools.JsonUtil;
import com.dtk.weixin.wxtools.LocalIPUtil;
import com.dtk.weixin.wxtools.SignUtil;
import com.dtk.weixin.wxtools.ValidateUtil;
import com.dtk.weixin.wxtools.WeixinUtil;
import com.dtk.weixin.wxtools.XmlUtil;

/**
 * 
 * <p>Description: </p>
 * @author wy
 * @date 2017年7月25日 上午9:01:57
 */
@Controller
@RequestMapping("weixin/pay")
public class HtmlPayController {
	
	private static Log logger = LogFactory.getLog(HtmlPayController.class);
	
	private String appId = PlatformConfig.getConfigItem("weixin", "appId");
	//app密码
	private String appSecret = PlatformConfig.getConfigItem("weixin", "appSecret");
	//商户号
	private String mchId = PlatformConfig.getConfigItem("weixin", "mchId");
    // 申请开通微信支付后，发给开发者。用于计算签名
	private String apiKey = PlatformConfig.getConfigItem("weixin", "apiKey");
	//交易类型
	private String tradeType = PlatformConfig.getConfigItem("weixin", "tradeType");
    // 微信支付 统一下单接口
	private String unifiedOrder = PlatformConfig.getConfigItem("weixin", "unifiedOrder");
    // 支付 回调url
	private String notifyUrl = PlatformConfig.getConfigItem("weixin", "notifyUrl");
	
	
	
	@RequestMapping("getCode")
	@ResponseBody
	public Map<String, String> getCode(String code){
		Map<String, String> result = new HashMap<String, String>();
		result.put("code", "0");
		if(code == null || code.equals("")){
			result.put("message", "用户code为空,请联系管理员！");
			return result;
		}
		String access_token_url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
		String requestUrl = access_token_url.replace("APPID", appId).replace("SECRET", appSecret).replace("CODE", code);  
        JSONObject jsonObject = WeiChatUtil.httpRequest(requestUrl, "GET", null);  
        String openid = jsonObject.getString("openid");
		System.out.println(openid);
		if(openid == null || openid.equals("")){
			result.put("message", "未取得用户openid,请联系管理员！");
			return result;
		}
		result.put("code", "1");
		result.put("openId", openid);
		return result;
	}
	
	
	
	@RequestMapping(value = "/doPay")
	@ResponseBody
	public JSONObject doPay(HttpServletRequest request, HttpServletResponse response, Model model,
            String openId){
		if(null == openId || "".equals(openId)){
			logger.info("openId is not correct, " + "openId = " + openId);
            throw new RuntimeException("签名校验不通过");
		}
		
	    String strDate = DateUtil.format(new Date(), new SimpleDateFormat("yyyyMMddHHmmss"));
	    //商户订单号
        String outTradeNo = "dtkparkfee" + strDate;
		
        PayOrderParam param = new PayOrderParam();
        // 基本信息
        param.setAppid(appId);
        param.setMchId(mchId);
        param.setTradeType(tradeType); // 公众号支付
        param.setOpenid(openId); // openId!!
        param.setSpbillCreateIp(LocalIPUtil.getLocalAddr());
        //param.setLimitPay("no_credit"); // 禁止用信用卡

        param.setNotifyUrl(notifyUrl); // 支付成功回调url

        // 业务相关参数
        JSONObject atach = new JSONObject();
        atach.put("order_id", 11);
        param.setAttach(atach.toString());
        param.setBody("支付测试订单");
        param.setTotalFee(1);
        param.setOutTradeNo(outTradeNo); // 客户订单号

        //签名
        param.setNonceStr(EncryptUtil.random());
        Map<String, Object> data = BeanUtil.object2Map(param); // 参数列表
        param.setSign(SignUtil.sign(data, apiKey)); // 计算sign
        data.put(PayOrderField.SIGN.getField(), param.getSign()); // sign放到map中，为后续转xml

        // 校验参数是否齐全
        try {
            ValidateUtil.validate(PayOrderField.values(), data);
        } catch (Exception e) {
            return JsonUtil.getJson(1, e.getMessage());
        }

        // 转成xml格式
        String xml = XmlUtil.toXml(data);
        logger.info("post.xml=" + xml);
        // 发送支付请求
        String resultStr = WeixinUtil.postXml(unifiedOrder, xml);
        logger.info("result=" + resultStr);

        // 校验返回结果 签名
        Map<String, Object> resultMap = XmlUtil.parseXml(resultStr);
        String resultSign = SignUtil.sign(resultMap, apiKey);
        if (resultMap.get("sign") == null || !resultMap.get("sign").equals(resultSign)) {
            logger.info("sign is not correct, " + resultMap.get("sign") + " " + resultSign);
            throw new RuntimeException("签名校验不通过");
        }

        PayOrderResult result = BeanUtil.map2Object(PayOrderResult.class, resultMap);

        PayResult payResult = new PayResult();
        if (ResultCode.SUCCESS.getCode().equals(result.getReturnCode())
                && ResultCode.SUCCESS.getCode().equals(result.getResultCode())) {
            payResult.setResultCode(ResultCode.SUCCESS.getCode());
        } else {
            payResult.setResultCode(ResultCode.FAIL.getCode());
        }
        payResult.setMessage(result.getReturnMsg());
        payResult.setErrCode(result.getErrCode());
        payResult.setErrorMessage(result.getErrCodeDes());
        payResult.setPrepayId(result.getPrepayId());
        payResult.setCodeUrl(result.getCodeUrl());

        JSONObject ret = JsonUtil.getOkJson();
        ret.put("reslt", payResult);
        ret.put("param", genJsParam(payResult));

        return ret;
		
	}
	
	
	private JSONObject genJsParam(PayResult payResult) {
        Long timestamp = System.currentTimeMillis() / 1000;
        String nonceStr = EncryptUtil.random();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("appId", appId);
        data.put("timeStamp", timestamp.toString());
        data.put("nonceStr", nonceStr);
        data.put("package", "prepay_id=" + payResult.getPrepayId());
        data.put("signType", "MD5");

        data.put("paySign", SignUtil.sign(data, apiKey)); // 计算sign

        JSONObject ret = JSONObject.parseObject(JSON.toJSONString(data));
        return ret;
    }
	
	
	
}
