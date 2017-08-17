package com.dtk.platform.service;

import com.alibaba.fastjson.JSONObject;
import com.dtk.platform.bean.Users;

public interface UsersService {

	public Users queryUsersByOpenId(String openId) throws Exception;
	
	public int saveUsers(JSONObject jsonObj) throws Exception;
	
	public int updateUsers(JSONObject jsonObj) throws Exception;
	
}
