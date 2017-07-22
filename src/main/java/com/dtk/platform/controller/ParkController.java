package com.dtk.platform.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dtk.platform.service.ParkService;

@Controller
@RequestMapping("/sys")
public class ParkController {

	@Autowired
	private ParkService parkService;

	@RequestMapping("/toLogin.do")
	public Object toLogin() throws Exception {
		return "toLogin";
	}

	@RequestMapping("/login.do")
	@ResponseBody
	public Object login(String username, String password) throws Exception {
		Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
		// 校验请求用戶密码
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		token.setRememberMe(true);
		try {
			SecurityUtils.getSubject().login(token);
			resultMap.put("status", 200);
			resultMap.put("message", "登录成功");
		} catch (Exception e) {
			resultMap.put("status", 500);
			resultMap.put("message", "帐号或密码错误");
		}
		return resultMap;
	}

	@RequestMapping("/a")
	@ResponseBody
	public Object a() throws Exception {
		return parkService.queryTestInfo();
	}

}
