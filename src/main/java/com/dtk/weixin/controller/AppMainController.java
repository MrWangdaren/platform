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


@Controller
@RequestMapping("weixin/main")
public class AppMainController {
	
	private static Log logger = LogFactory.getLog(AppMainController.class);

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
	
	// 回调url
    @RequestMapping(value = "pay/callback", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String notify(HttpServletRequest request) {
        try {
            String xml = IOUtils.toString(request.getInputStream());
            logger.info("weixin pay notify result is " + xml);
            if (StringUtils.isBlank(xml)) {
                return WeixinUtil.getResult(ResultCode.FAIL, "接受参数为空");
            }
            Map<String, Object> map = XmlUtil.parseXml(xml);
            PayNotifyResult result = BeanUtil.map2Object(PayNotifyResult.class, map);
            logger.info(JSON.toJSONString(result, true));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return WeixinUtil.getResult(ResultCode.FAIL, "解析异常");
        }
        return WeixinUtil.getResult(ResultCode.SUCCESS, "OK");
    }
	
}
