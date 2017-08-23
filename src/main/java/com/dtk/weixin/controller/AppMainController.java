package com.dtk.weixin.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dtk.platform.bean.CarInfo;
import com.dtk.platform.bean.CarInfoExample;
import com.dtk.platform.bean.InPark;
import com.dtk.platform.bean.InParkExample;
import com.dtk.platform.bean.Users;
import com.dtk.platform.dao.CarInfoMapper;
import com.dtk.platform.dao.InParkMapper;
import com.dtk.platform.service.UsersService;
import com.dtk.weixin.model.PayNotifyResult;
import com.dtk.weixin.model.enums.ResultCode;
import com.dtk.weixin.wxutils.BeanUtil;
import com.dtk.weixin.wxutils.CookieUtil;
import com.dtk.weixin.wxutils.DateUtil;
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
	
	@Autowired
	private UsersService usersService;
	@Autowired
	private CarInfoMapper carInfoDao;
	@Autowired
	private InParkMapper inParkDao;
	

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
	public Map<String, String> isInPark(String carLicense, int licenseType){
		Map<String, String> res = new HashMap<String, String>();
		
		InParkExample inParkExample = new InParkExample();
		InParkExample.Criteria inSql = inParkExample.createCriteria();
		inSql.andCarLicenseEqualTo(carLicense).andLicenseTypeEqualTo(licenseType).andIsPayEqualTo(0);
		List<InPark> ls = inParkDao.selectByExample(inParkExample);
		if(ls != null && ls.size() ==  1){
			res.put("code", "200");
		}else{
			res.put("msg", "该车不再场内！");
		}
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
    
    /**
     * 
     * @description 加载页面数据
     * @param  
     * @author wy
     * @date 2017年8月15日 上午10:05:42
     */
    @RequestMapping(value = "loadCarInfo")
    @ResponseBody
    public Map<String, Object>  loadCarInfo(HttpServletRequest request){
    	Map<String, Object> res = new HashMap<String, Object>();
    	List<CarInfo> carInfoList = null;
    	List<InPark> inParkList = new ArrayList<InPark>(); 
    	
    	try{
    		String openId = CookieUtil.getOpenId(request);
    		Users users = usersService.queryUsersByOpenId(openId);
    		CarInfoExample example = new CarInfoExample();
    		example.createCriteria().andAttributionUserId1EqualTo(users.getId()).andStateEqualTo(1);
    		example.or().andAttributionUserId2EqualTo(users.getId()).andStateEqualTo(1);
    		example.setOrderByClause("ID");
    		carInfoList = carInfoDao.selectByExample(example);
    		for(CarInfo info : carInfoList){
    			String license = info.getCarLicense();
    			int licenseType = info.getLicenseType();
    			InParkExample inParkExample = new InParkExample();
    			InParkExample.Criteria inSql = inParkExample.createCriteria();
    			inSql.andCarLicenseEqualTo(license).andLicenseTypeEqualTo(licenseType).andIsPayEqualTo(0);
    			List<InPark> ls = inParkDao.selectByExample(inParkExample);
    			if(ls != null && ls.size() > 0){
    				InPark inPark = ls.get(0);
    				Date date = DateUtil.parseDefaultTime(inPark.getComeTime());
    				Long stopTime = DateUtil.intervalTime(date, new Date())/(1000*60);//转化为分
    				ls.get(0).setStopTime(stopTime);
    				inParkList.add(ls.get(0));
    			}
    		}
    		res.put("code", "1");
    		res.put("carInfoList", carInfoList);
    		res.put("inParkList", inParkList);
    	}catch(Exception e){
    		logger.error(e.getMessage(), e);
    		e.printStackTrace();
    	}
    	return res;
    }
    
 
	
}
