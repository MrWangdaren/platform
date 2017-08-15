package com.dtk.platform.service;

import com.dtk.platform.bean.Users;

public interface UsersService {

	public Users queryUsersByOpenId(String openId) throws Exception;

}
