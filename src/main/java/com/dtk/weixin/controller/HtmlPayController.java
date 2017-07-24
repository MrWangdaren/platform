package com.dtk.weixin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.dtk.weixin.utils.WeiChatUtil;


@Controller
@RequestMapping("weixin/pay")
public class HtmlPayController {
	
	@RequestMapping("getCode")
	public String getCode(String code){
		//测试公众号
//		String appid = "wx5c9084f7fbb10d87";
//		String appsecret = "efa592c7dc2dca848b08237f8ecf298e";
		
		//商户公众号
		String appid = "wxd610d0789b57e504";
		String appsecret = "6b9350c26d8ff86fffcdbc63f0f2daf3";
		
		
		String access_token_url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
		String requestUrl = access_token_url.replace("APPID", appid).replace("SECRET", appsecret).replace("CODE", code);  
        JSONObject jsonObject = WeiChatUtil.httpRequest(requestUrl, "GET", null);  
		System.out.println(jsonObject);
		
		return "123";
	}
	

	@RequestMapping("/payparm")  
    public void payparm(HttpServletRequest request, HttpServletResponse response){  
        try {  
            // 获取openid  
            String openId = (String) request.getSession().getAttribute("openId");  
            System.out.println(openId);
//            if (openId == null) {  
//                openId = getUserOpenId(request);  
//            }  
//  
//            String appid = WXConfig.APP_ID;  
//            String paternerKey = WXConfig.PERTNER_KEY;  
//              
//            String out_trade_no = getTradeNo();  
//            Map<String, String> paraMap = new HashMap<String, String>();  
//            paraMap.put("appid", appid);  
//            paraMap.put("attach", "测试");  
//            paraMap.put("body", "测试购买支付");  
//            paraMap.put("mch_id", WXConfig.PARTNER);  
//            paraMap.put("nonce_str", create_nonce_str());  
//            paraMap.put("openid", openId);  
//            paraMap.put("out_trade_no", out_trade_no);  
//            paraMap.put("spbill_create_ip", getAddrIp(request));  
//            paraMap.put("total_fee", "1");  
//            paraMap.put("trade_type", "JSAPI");  
//            paraMap.put("notify_url", "http://m.ebiaotong.com/WXPay/notify");// 此路径是微信服务器调用支付结果通知路径  
//            String sign = getSign(paraMap, paternerKey);  
//            paraMap.put("sign", sign);  
//            // 统一下单 https://api.mch.weixin.qq.com/pay/unifiedorder  
//            String url = "https://api.mch.weixin.qq.com/pay/unifiedorder";  
//  
//            String xml = ArrayToXml(paraMap);  
//  
//            String xmlStr = HttpKit.post(url, xml);  
//  
//            // 预付商品id  
//            String prepay_id = "";  
//  
//            if (xmlStr.indexOf("SUCCESS") != -1) {  
//                Map<String, String> map = doXMLParse(xmlStr);  
//                prepay_id = (String) map.get("prepay_id");  
//            }  
//  
//            String timeStamp = create_timestamp();  
//            String nonceStr = create_nonce_str();  
//            Map<String, String> payMap = new HashMap<String, String>();  
//            payMap.put("appId", appid);  
//            payMap.put("timeStamp", timeStamp);  
//            payMap.put("nonceStr", nonceStr);  
//            payMap.put("signType", "MD5");  
//            payMap.put("package", "prepay_id=" + prepay_id);  
//            String paySign = getSign(payMap, paternerKey);  
//              
//            payMap.put("pg", prepay_id);  
//            payMap.put("paySign", paySign);  
//              
//            // 拼接并返回json  
//            StringBuilder sBuilder = new StringBuilder("[{");  
//            sBuilder.append("appId:'").append(appid).append("',")  
//                        .append("timeStamp:'").append(timeStamp).append("',")  
//                        .append("nonceStr:'").append(nonceStr).append("',")  
//                        .append("pg:'").append(prepay_id).append("',")  
//                        .append("signType:'MD5',")  
//                        .append("paySign:'").append(paySign).append("'");  
//            sBuilder.append("}]");  
//            response.getWriter().print(sBuilder.toString());  
//            response.getWriter().close();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
	
	
}
