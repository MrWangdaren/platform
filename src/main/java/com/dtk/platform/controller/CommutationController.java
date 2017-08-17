package com.dtk.platform.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/Commutation")
public class CommutationController {
	
	@RequestMapping("receiveData")
	@ResponseBody
	public Map<String, String> receiveData(){
		Map<String, String> res = new HashMap<String, String>();
		
		
		return res;
	}
	
	@RequestMapping("uploadData")
	@ResponseBody
	public Map<String, Object> updateData(){
		Map<String, Object> res = new HashMap<String, Object>();
		
		
		return res;
	}

}
