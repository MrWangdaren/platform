package com.dtk.weixin.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dtk.platform.bean.CarInfo;
import com.dtk.platform.bean.CarInfoExample;
import com.dtk.platform.bean.InPark;
import com.dtk.platform.bean.Users;
import com.dtk.platform.dao.CarInfoMapper;
import com.dtk.platform.service.UsersService;
import com.dtk.platform.tools.PlatformConfig;
import com.dtk.weixin.wxutils.CookieUtil;


/**
 * 
 * <p>Description: 车牌绑定 </p>
 * @author wy
 * @date 2017年7月25日 下午3:59:12
 */
@Controller
@RequestMapping("weixin/license")
public class LicenseController {
	
	//从配置文件中读取域名
    public static String rootUrl = PlatformConfig.getConfigItem("platform", "rootUrl");
	
	private static Log logger = LogFactory.getLog(LicenseController.class);
	
	@Autowired
	private UsersService usersService;
	@Autowired
	private CarInfoMapper carInfoDao;
	
	@RequestMapping("loadLicenseInfo")
	@ResponseBody
	public Map<String, Object> loadLicenseInfo(HttpServletRequest request){
		
		Map<String, Object> res = new HashMap<String, Object>();
		List<CarInfo> carList = new ArrayList<CarInfo>();
		try {
			String openId = CookieUtil.getOpenId(request);
			Users user = usersService.queryUsersByOpenId(openId);
			CarInfoExample example = new CarInfoExample();
    		example.createCriteria().andAttributionUserId1EqualTo(user.getId()).andStateEqualTo(1);
    		example.or().andAttributionUserId2EqualTo(user.getId()).andStateEqualTo(1);
    		example.setOrderByClause("ID");
    		carList = carInfoDao.selectByExample(example);
    		res.put("code", "1");
    		res.put("licenseInfo", carList);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("loadLicenseInfo is error carList=" + carList);
		}
		return res;
	}
	
	@RequestMapping("addLicense")
	@ResponseBody
	public Map<String, Object> addLicense(HttpServletRequest request, String carLicense, Integer licenseType){
		
		Map<String, Object> res = new HashMap<String, Object>();
		List<CarInfo> carList = new ArrayList<CarInfo>();
		res.put("code", "0");
		try {
			CarInfoExample carInfoExp = new CarInfoExample();
			CarInfoExample.Criteria carInfoSql = carInfoExp.createCriteria();
			carInfoSql.andCarLicenseEqualTo(carLicense).andLicenseTypeEqualTo(licenseType)
			.andStateEqualTo(1);
			carList = carInfoDao.selectByExample(carInfoExp);
			if(carList != null && carList.size() > 0){
				res.put("message", "车牌 " + carLicense + " 已被他人绑定！");
			}else{
				String openId = CookieUtil.getOpenId(request);
				Users user = usersService.queryUsersByOpenId(openId);
				CarInfo carInfo = new CarInfo();
				carInfo.setAttributionUserId1(user.getId());
				carInfo.setCarLicense(carLicense);
				carInfo.setCreateTime(new Date());
				carInfo.setLicenseType(licenseType);
				carInfo.setState(1);
				
				int num = carInfoDao.insert(carInfo);
				if(num == 1){
					res.put("code", "1");
					res.put("message", "车牌 " + carLicense + " 绑定成功！");
				}else{
					res.put("message", "车牌 " + carLicense + " 绑定失败！");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("loadLicenseInfo is error carList=" + carList);
			res.put("message", "绑定车牌 " + carLicense + " 出错");
		}
		return res;
	}
	
	@RequestMapping("deleteLicense")
	@ResponseBody
	public Map<String, Object> deleteLicense(Integer id){
		
		Map<String, Object> res = new HashMap<String, Object>();
		try {
			int num = carInfoDao.deleteByPrimaryKey(id);
			if(num == 1){
				res.put("code", "1");
			}else{
				res.put("message", "解绑车牌失败!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("deleteLicense is error");
			res.put("message", "解绑车牌 出错");
		}
		return res;
	}
	
}
