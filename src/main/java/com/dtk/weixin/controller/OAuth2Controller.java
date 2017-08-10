package com.dtk.weixin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;
import com.dtk.platform.tools.PlatformConfig;
import com.dtk.weixin.wxutils.WeixinUtil;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 
 * <p>Description: 微信授权获取用户openid </p>
 * @author wy
 * @date 2017年8月10日 上午9:38:12
 */
@Controller
@RequestMapping("weixin/oauth2")
public class OAuth2Controller {
    
    //从配置文件中读取域名
    public static String rootUrl = PlatformConfig.getConfigItem("platform", "rootUrl");
    //商户公众号appID
  	private String appId = PlatformConfig.getConfigItem("weixin", "appId");
  	//app密码
  	private String appSecret = PlatformConfig.getConfigItem("weixin", "appSecret");
    /**
     * 
     * @description 组装授权url
     * @param  
     * @author wy
     * @date 2017年8月10日 上午9:38:59
     */
    @RequestMapping(value ="/api")
    public String oauth2API(HttpServletRequest request, @RequestParam String resultUrl) throws UnsupportedEncodingException {
        String redirectUrl = "";
        if (resultUrl != null) {
            String backUrl = rootUrl + "/platform/weixin/oauth2/meUrl";
            //组装授权url
            String reditecct_url = URLEncoder.encode(backUrl, "UTF-8");
		    String getCodeUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";
		    redirectUrl = getCodeUrl.replace("APPID", appId).replace("REDIRECT_URI", reditecct_url).replace("SCOPE", "snsapi_base").replace("STATE", resultUrl);
        }
        return "redirect:" + redirectUrl;
    }

    /**
     * 
     * @description 获取用户信息
     * @param  
     * @author wy
     * @date 2017年8月10日 上午9:39:19
     */
    @RequestMapping(value = "/meUrl")
    public String oauth2MeUrl(HttpServletRequest request,HttpServletResponse response, @RequestParam String code,
    		@RequestParam(value = "state") String resultUrl) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        session.setAttribute("code",code);
        // 用户同意授权
        if (!"authdeny".equals(code)) {
            // 获取网页授权access_token
        	String access_token_url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
    		String requestUrl = access_token_url.replace("APPID", appId).replace("SECRET", appSecret).replace("CODE", code);  
            JSONObject jsonObject = WeixinUtil.httpRequest(requestUrl, "GET", null);  
            String openId = jsonObject.getString("openid");
            //获取微信用户openid存储在cookie中的信息
            Cookie userCookie=new Cookie("openId",openId);
            userCookie.setMaxAge(-1);
            userCookie.setPath("/");
            response.addCookie(userCookie);
        }else {
            return "redirect:"+rootUrl+"/error404";
        }
        return "redirect:" + resultUrl;
    }
}
