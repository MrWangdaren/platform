package com.dtk.weixin.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;

import com.dtk.platform.tools.PlatformConfig;

/**
 * 
 * <p>Description: 微信授权过滤器  </p>
 * @author wy
 * @date 2017年8月10日 上午9:41:03
 */
public class WeixinLoginFilter implements Filter {
	
	public static List<String> pattenURL = new ArrayList<String>(); 

	//从配置文件中读取域名
    public static String rootUrl = PlatformConfig.getConfigItem("platform", "rootUrl");

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//忽略的URl
        pattenURL.add("oauth2");//修改密码方法  
        pattenURL.add("css");//css  
        pattenURL.add("img");//image  
        pattenURL.add("js");//js  
        pattenURL.add("fonts");//fonts  
        pattenURL.add("png"); 
        pattenURL.add("jpg"); 
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;  
        HttpServletResponse httpResponse = (HttpServletResponse) response;  
        Cookie[] cookies = httpRequest.getCookies();
        String openId=null;
        String url = httpRequest.getRequestURI().toString();  
        for (String urlStr : pattenURL) {  
        	if(url.indexOf(urlStr) > -1){  
                chain.doFilter(request, response);  
                return;  
            }  
        }  
        //判断cookie中是否存在openid 若存在则直接跳过，不存在则获取一次
        if(cookies!=null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("openId")){
                    openId = cookie.getValue();
                }
            }
        }
          
        /** 
         * openId是否为空
         */
        if (StringUtils.isEmpty(openId)) {
        	// 授权url  
            String oauth2Path = rootUrl + "/platform/weixin/oauth2/api.do?resultUrl=" + rootUrl + url;
        	httpResponse.sendRedirect(oauth2Path);	
        } else {
        	chain.doFilter(request, response); 
        }
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	} 


}
