package com.dtk.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtk.platform.bean.Users;
import com.dtk.platform.dao.UsersMapper;
import com.dtk.platform.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersDao;

	@Override
	public Users queryUsersByOpenId(String openId) throws Exception {
		return usersDao.queryUsersByOpenId(openId);
	}

}
