package com.dtk.weixin.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dtk.weixin.model.PayNotifyResult;
import com.dtk.weixin.model.enums.ResultCode;
import com.dtk.weixin.wxutils.BeanUtil;
import com.dtk.weixin.wxutils.WeixinUtil;
import com.dtk.weixin.wxutils.XmlUtil;

/**
 * 
 * <p>Description: 个人中心 </p>
 * @author wy
 * @date 2017年7月25日 下午3:59:12
 */
@Controller
@RequestMapping("weixin/center")
public class CenterController {
	
	private static Log logger = LogFactory.getLog(CenterController.class);
	
	
	@RequestMapping("init")
	public String init(){
		return "weixin/center/center";
	}
	
	
	
}
