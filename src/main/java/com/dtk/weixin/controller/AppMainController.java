package com.dtk.weixin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("weixin/main")
public class AppMainController {

	@RequestMapping("toMain")
	public String toMain(){
		
		return "weixin/park/main";
	}
	
	@RequestMapping("pay/toPay")
	public String toPay(HttpServletRequest request, HttpServletResponse response){
		
		try{
			String code = (String) request.getSession().getAttribute("code"); 
		}catch(Exception e){
			e.printStackTrace();
		}
		return "weixin/park/main";
	}
	
	
	
}
