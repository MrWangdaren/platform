package com.dtk.weixin.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * <p>Description: 记录查询 </p>
 * @author wy
 * @date 2017年7月25日 下午3:59:12
 */
@Controller
@RequestMapping("weixin/record")
public class RecordController {
	
	private static Log logger = LogFactory.getLog(RecordController.class);
		
	@RequestMapping("init")
	public String init(){
		return "weixin/record/record";
	}
	
	
	
}
