package com.dtk.weixin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
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
 * <p>Description: 微信主页与回调 </p>
 * @author wy
 * @date 2017年7月25日 下午3:59:12
 */
@Controller
@RequestMapping("weixin/main")
public class AppMainController {
	
	private static Log logger = LogFactory.getLog(AppMainController.class);

	/**
	 * 
	 * @description 初始化页面跳转
	 * @param  
	 * @author wy
	 * @date 2017年8月4日 上午11:01:04
	 */
	@RequestMapping("init")
	public String init(){
		return "weixin/park/main";
	}
	
	/**
	 * 
	 * @description 是否在场内
	 * @param  
	 * @author wy
	 * @date 2017年8月4日 上午11:00:43
	 */
	@RequestMapping("isInPark")
	@ResponseBody
	public Map<String, String> isInPark(String carNo){
		Map<String, String> res = new HashMap<String, String>();
		res.put("code", "200");
		return res;
	}
	
	
	/**
	 * 
	 * @description 支付回调 通知支付状态
	 * @param  
	 * @author wy
	 * @date 2017年8月4日 上午11:02:41
	 */
    @RequestMapping(value = "pay/callback")
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
