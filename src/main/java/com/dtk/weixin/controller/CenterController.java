package com.dtk.weixin.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dtk.platform.bean.CarInfo;
import com.dtk.platform.bean.Users;
import com.dtk.platform.service.UsersService;
import com.dtk.platform.tools.PlatformConfig;
import com.dtk.weixin.wxutils.CookieUtil;


/**
 * 
 * <p>Description: 个人中心 </p>
 * @author wy
 * @date 2017年7月25日 下午3:59:12
 */
@Controller
@RequestMapping("weixin/center")
public class CenterController {
	
	//从配置文件中读取域名
    public static String rootUrl = PlatformConfig.getConfigItem("platform", "rootUrl");
	
	private static Log logger = LogFactory.getLog(CenterController.class);
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("init")
	public String init(HttpServletRequest request ){
		String redirectUrl = "";
		String resultUrl = rootUrl + "/platform/weixin/center/toCenter.do";
		try {
			String openId = CookieUtil.getOpenId(request);
			Users user = usersService.queryUsersByOpenId(openId);
			if(user.getVipName() != null && !"".equals(user.getVipName())){
				redirectUrl = resultUrl;
			}else{
				//主动授权url  
				redirectUrl = rootUrl + "/platform/weixin/oauth2/authApi.do?resultUrl=" + resultUrl;
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("center init is error redirectUrl = " + redirectUrl);
		}
		return "redirect:" + redirectUrl;
	}
	
	/**
	 * 
	 * @description 跳转个人中心页面
	 * @param  
	 * @author wy
	 * @date 2017年8月16日 下午4:19:41
	 */
	@RequestMapping("toCenter")
	public String toCenter(){
		return "weixin/center/center";
	}
	
	@RequestMapping("getUser")
	@ResponseBody
	public Users getUser(HttpServletRequest request){
		Users user = null;
		try {
			String openId = CookieUtil.getOpenId(request);
			user = usersService.queryUsersByOpenId(openId);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("getUser is error user=" + user);
		}
		return user;
	}
	
	
	
	@RequestMapping("toBoundCar")
	public String toBoundCar(HttpServletRequest request, Model model){
		List<CarInfo> carList = new ArrayList<CarInfo>();
		try {
			String openId = CookieUtil.getOpenId(request);
			Users user = usersService.queryUsersByOpenId(openId);
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("getCarInfo is error carList=" + carList);
		}
		return "weixin/center/license";
	}
	
	
	
	
}
