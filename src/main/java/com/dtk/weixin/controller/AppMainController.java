package com.dtk.weixin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("weixin/main")
public class AppMainController {

	@RequestMapping("toMain")
	public String toMain(){
		
		return "weixin/park/main";
	}
	
	
}
