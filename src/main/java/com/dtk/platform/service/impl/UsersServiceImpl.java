package com.dtk.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.dtk.platform.bean.Users;
import com.dtk.platform.dao.UsersMapper;
import com.dtk.platform.service.UsersService;
import com.github.pagehelper.util.StringUtil;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersDao;
	
	@Override
	public Users queryUsersByOpenId(String openId) throws Exception {
		return usersDao.queryUsersByOpenId(openId);
	}

	@Override
	public int saveUsers(JSONObject jsonObj) throws Exception {
		int result = 0;
		String openId = jsonObj.getString("openid");
		if(StringUtil.isNotEmpty(openId)){
			Users user = usersDao.queryUsersByOpenId(openId);
			if(user == null){
				user = new Users();
				user.setOpenId(openId);
				user.setToken(jsonObj.getString("access_token"));
				result = usersDao.insert(user);
			}
		}
		return result;
	}

	@Override
	public int updateUsers(JSONObject jsonObj) throws Exception {
		int result = 0;
		String openId = jsonObj.getString("openid");
		if(StringUtil.isNotEmpty(openId)){
			Users user = usersDao.queryUsersByOpenId(openId);
			if(user != null){
				user.setOpenId(openId);
				user.setVipName(jsonObj.getString("nickname"));
				user.setVipGender(jsonObj.getInteger("sex"));
				user.setVipHeaderIcon(jsonObj.getString("headimgurl"));
				user.setUnionUniqueId(jsonObj.getString("unionid"));
				result = usersDao.updateByPrimaryKey(user);
			}
		}
		return result;
	}

}
