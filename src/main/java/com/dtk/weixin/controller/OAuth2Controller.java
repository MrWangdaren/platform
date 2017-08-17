package com.dtk.weixin.controller;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;
import com.dtk.platform.bean.Users;
import com.dtk.platform.service.UsersService;
import com.dtk.platform.tools.PlatformConfig;
import com.dtk.weixin.wxutils.WeixinUtil;
import com.github.pagehelper.util.StringUtil;

/**
 * 
 * <p>Description: 微信授权获取用户openid与用户信息 </p>
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
  	
  	private static Log logger = LogFactory.getLog(OAuth2Controller.class);
  	
  	@Autowired
  	private UsersService userService;
  	
    /**
     * 
     * @description 组装静默授权url
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
		    //snsapi_base 为静默授权 只能获取用户openid
		    redirectUrl = getCodeUrl.replace("APPID", appId).replace("REDIRECT_URI", reditecct_url).replace("SCOPE", "snsapi_base").replace("STATE", resultUrl);
        }
        return "redirect:" + redirectUrl;
    }

    /**
     * 
     * @description 获取静默授权用户OpenId
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
        try {
        	// 用户同意授权
            if (!"authdeny".equals(code)) {
                // 获取网页授权access_token
            	String access_token_url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
        		String requestUrl = access_token_url.replace("APPID", appId).replace("SECRET", appSecret).replace("CODE", code);  
                JSONObject jsonObject = WeixinUtil.httpRequest(requestUrl, "GET", null);  
                String openId = jsonObject.getString("openid");
                if(StringUtil.isNotEmpty(openId)){
                	userService.saveUsers(jsonObject);
                    //获取微信用户openid存储在cookie中的信息
                    Cookie userCookie=new Cookie("openId",openId);
                    userCookie.setMaxAge(-1);
                    userCookie.setPath("/");
                    response.addCookie(userCookie);
                }
            }else {
                return "redirect:"+rootUrl+"/plateform/weixin/main/init.do";
            }
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("静默授权失败");
		}
        return "redirect:" + resultUrl;
    }
    
    /**
     * 
     * @description 拼接主动授权Url
     * @param  
     * @author wy
     * @date 2017年8月16日 下午4:26:37
     */
    @RequestMapping(value ="/authApi")
    public String authApi(HttpServletRequest request, @RequestParam String resultUrl) throws UnsupportedEncodingException {
        String redirectUrl = "";
        if (resultUrl != null) {
            String backUrl = rootUrl + "/platform/weixin/oauth2/authMeUrl";
            //组装授权url
            String reditecct_url = URLEncoder.encode(backUrl, "UTF-8");
		    String getCodeUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";
		    //snsapi_userinfo 为主动授权 弹出授权页面，可通过openid拿到昵称、性别、所在地
		    redirectUrl = getCodeUrl.replace("APPID", appId).replace("REDIRECT_URI", reditecct_url).replace("SCOPE", "snsapi_userinfo").replace("STATE", resultUrl);
        }
        return "redirect:" + redirectUrl;
    }
    
    /**
     * 
     * @description 主动授权处理
     * @param  
     * @author wy
     * @date 2017年8月16日 下午4:28:13
     */
    @RequestMapping(value = "/authMeUrl")
    public String authMeUrl(HttpServletRequest request,HttpServletResponse response, @RequestParam String code,
    		@RequestParam(value = "state") String resultUrl) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        session.setAttribute("code",code);
        try{
        	// 用户同意授权
            if (!"authdeny".equals(code)) {
                // 获取网页授权access_token
            	String access_token_url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
        		String requestUrl = access_token_url.replace("APPID", appId).replace("SECRET", appSecret).replace("CODE", code);  
                JSONObject jsonObject = WeixinUtil.httpRequest(requestUrl, "GET", null);  
                String openId = jsonObject.getString("openid");
                // 网页授权接口访问凭证
                String accessToken = jsonObject.getString("access_token");
                
                String userInfoUrl = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
                String userRequestUrl = userInfoUrl.replace("ACCESS_TOKEN", accessToken).replace("OPENID", openId);
                JSONObject userJsonObject = WeixinUtil.httpRequest(userRequestUrl, "GET", null);  
                String name = userJsonObject.getString("nickname");
                if(StringUtil.isNotEmpty(name)){
                	userService.updateUsers(userJsonObject);
                    //获取微信用户openid存储在cookie中的信息
                    Cookie userCookie=new Cookie("openId",openId);
                    userCookie.setMaxAge(-1);
                    userCookie.setPath("/");
                    response.addCookie(userCookie);
                }
            }else {
                return "redirect:"+rootUrl+"/plateform/weixin/main/init.do";
            }
        }catch(Exception e){
        	e.printStackTrace();
        	logger.info("主动授权失败");
        }
        return "redirect:" + resultUrl;
    }
    
}
