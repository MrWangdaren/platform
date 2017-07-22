package com.dtk.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dtk.platform.dao.ParkMapper;
import com.dtk.platform.service.ParkService;

@Service
@Transactional
public class ParkServiceImpl implements ParkService {

	@Autowired
	private ParkMapper parkDao;

	@Override
	public String queryTestInfo() throws Exception {
		return parkDao.queryTestInfo();
	}

}
