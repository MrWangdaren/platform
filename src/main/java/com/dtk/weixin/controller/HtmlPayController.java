package com.dtk.weixin.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dtk.platform.bean.InPark;
import com.dtk.platform.bean.InParkExample;
import com.dtk.platform.dao.InParkMapper;
import com.dtk.platform.tools.PlatformConfig;
import com.dtk.weixin.model.PayOrderParam;
import com.dtk.weixin.model.PayOrderResult;
import com.dtk.weixin.model.PayQueryField;
import com.dtk.weixin.model.PayQueryParam;
import com.dtk.weixin.model.PayQueryResult;
import com.dtk.weixin.model.PayResult;
import com.dtk.weixin.model.enums.PayOrderField;
import com.dtk.weixin.model.enums.ResultCode;
import com.dtk.weixin.wxutils.BeanUtil;
import com.dtk.weixin.wxutils.DateUtil;
import com.dtk.weixin.wxutils.EncryptUtil;
import com.dtk.weixin.wxutils.JsonUtil;
import com.dtk.weixin.wxutils.LocalIPUtil;
import com.dtk.weixin.wxutils.SignUtil;
import com.dtk.weixin.wxutils.ValidateUtil;
import com.dtk.weixin.wxutils.WeixinUtil;
import com.dtk.weixin.wxutils.XmlUtil;

/**
 * 
 * <p>Description: H5支付 </p>
 * @author wy
 * @date 2017年7月25日 上午9:01:57
 */
@Controller
@RequestMapping("weixin/pay")
public class HtmlPayController {
	
	private static Log logger = LogFactory.getLog(HtmlPayController.class);
	
	//商户公众号appID
	private String appId = PlatformConfig.getConfigItem("weixin", "appId");
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
	// 重定向支付url
	private String redirectUrl = PlatformConfig.getConfigItem("weixin", "redirectUrl");
	//订单支付状态url
	private String orderQueryUrl = PlatformConfig.getConfigItem("weixin", "orderQueryUrl");
	
	@Autowired
	private InParkMapper inParkDao;
	
	/**
	 * 
	 * @description 重定向支付页面并授权
	 * @param  
	 * @author wy
	 * @date 2017年7月28日 上午11:17:51
	 */
	@RequestMapping("init")
	public String init(HttpServletRequest request, HttpServletResponse response, Model model, 
			String carLicense, Integer licenseType){
		if(StringUtils.isBlank(carLicense)){
			logger.info("carLicense is not correct, " + "carLicense = " + carLicense);
            throw new RuntimeException("车牌号校验不通过");
		}
		if(licenseType == null){
			logger.info("licenseType is not correct, " + "licenseType = " + licenseType);
            throw new RuntimeException("车牌类型校验不通过");
		}
		model.addAttribute("carLicense", carLicense);
		model.addAttribute("licenseType", licenseType);
		return "redirect:" + redirectUrl;
	}
	
	/**
	 * 
	 * @description 加载页面数据
	 * @param  
	 * @author wy
	 * @date 2017年8月15日 下午2:16:25
	 */
	@RequestMapping("loadPayInfo")
	@ResponseBody
	public Map<String, Object> loadPayInfo(HttpServletRequest request, String carLicense, Integer licenseType){
		Map<String, Object> res = new HashMap<String, Object>();
		InPark inPark = null;
		try{
			InParkExample inParkExample = new InParkExample();
			InParkExample.Criteria inSql = inParkExample.createCriteria();
			inSql.andCarLicenseEqualTo(carLicense).andLicenseTypeEqualTo(licenseType).andIsPayEqualTo(0);
			List<InPark> ls = inParkDao.selectByExample(inParkExample);
			inPark = ls.get(0);
			
			res.put("code", 200);
			res.put("inPark", inPark);
		}catch(Exception e){
			e.printStackTrace();
			logger.info("loadPayInfo is not correct");
		}
		return res;
	}
	
	/**
	 * 
	 * @description 开始支付
	 * @param  
	 * @author wy
	 * @date 2017年8月4日 上午11:09:52
	 */
	@RequestMapping(value = "/doPay")
	@ResponseBody
	public JSONObject doPay(HttpServletRequest request, HttpServletResponse response, Model model, String carLicense){
		Cookie[] cookies = request.getCookies();
		String openId = "";
		//判断cookie中是否存在openid 若存在则直接跳过，不存在则获取一次
        if(cookies!=null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("openId")){
                    openId = cookie.getValue();
                }
            }
        }
		if(cookies == null || StringUtils.isEmpty(openId)){
			logger.info("openId is not correct, " + "openId = " + openId);
            throw new RuntimeException("openId为空");
		}
	    String strDate = DateUtil.format(new Date(), new SimpleDateFormat("yyyyMMddHHmmss"));
	    //商户订单号
        String outTradeNo = "dtkparkfee" + strDate;
        PayOrderParam param = new PayOrderParam();
        // 基本信息
        param.setAppid(appId);
        param.setMchId(mchId);
        param.setTradeType(tradeType); // 公众号支付
        param.setOpenid(openId); 
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
        ret.put("outTradeNo", outTradeNo);
        return ret;
	}
	
	/**
	 * 
	 * @description 查询订单
	 * @param  
	 * @author wy
	 * @date 2017年8月1日 下午2:15:27
	 */
	@RequestMapping("queryOrder")
    @ResponseBody
    public PayQueryResult query(HttpServletRequest request, HttpServletResponse response, String outTradeNo) {
        PayQueryParam param = new PayQueryParam();
        // 基本信息
        param.setAppid(appId);
        param.setMchId(mchId);
        param.setOutTradeNo(outTradeNo); // 客户订单号
        //签名
        param.setNonceStr(EncryptUtil.random());
        Map<String, Object> data = BeanUtil.object2Map(param); // 参数列表
        param.setSign(SignUtil.sign(data, apiKey)); // 计算sign
        data.put(PayOrderField.SIGN.getField(), param.getSign()); // sign放到map中，为后续转xml
        // 校验参数是否齐全
        ValidateUtil.validate(PayQueryField.values(), data);
        // 转成xml格式
        String xml = XmlUtil.toXml(data);
        logger.info("post.xml=" + xml);
        // 发送支付请求
        String resultStr = WeixinUtil.postXml(orderQueryUrl, xml);
        logger.info("result=" + resultStr);
        // 校验返回结果 签名
        Map<String, Object> resultMap = XmlUtil.parseXml(resultStr);
        String resultSign = SignUtil.sign(resultMap, apiKey);
        if (resultMap.get("sign") == null || !resultMap.get("sign").equals(resultSign)) {
            logger.info("sign is not correct, " + resultMap.get("sign") + " " + resultSign);
            throw new RuntimeException("签名校验不通过");
        }
        PayQueryResult result = BeanUtil.map2Object(PayQueryResult.class, resultMap);
        return result;
    }

	@RequestMapping("payOk")
	public String payOk(String outTradeNo, Model model){
		model.addAttribute("outTradeNo", outTradeNo);
		return "weixin/park/payOk";
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
