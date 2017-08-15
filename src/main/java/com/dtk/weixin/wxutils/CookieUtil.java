package com.dtk.weixin.wxutils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

public class CookieUtil {

	
	public static String getOpenId(HttpServletRequest request) throws Exception {
		
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
//			logger.info("openId is not correct, " + "openId = " + openId);
            throw new RuntimeException("openId为空");
		}
		return openId;
	}
	
	
}
