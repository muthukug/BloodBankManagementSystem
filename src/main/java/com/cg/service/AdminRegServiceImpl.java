package com.cg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.AdminDao;
import com.cg.dao.AdminRegDao;
import com.cg.pojo.AdminReg;
import com.cg.service.InvalidException;

@Service
@Transactional
public class AdminRegServiceImpl implements AdminRegService {

	@Autowired
	private AdminRegDao dao;

	@Autowired
	private AdminDao admin;

	@Override
	public Boolean adminregister(AdminReg add) {
		if (!dao.existsById(add.getPhoneNo())) {
			dao.save(add);
			return true;
		} else
			return false;
	}

	@Override
	public boolean adminlogin(String phoneNo, String password) throws InvalidException {
		AdminReg log;
		try {
			log = dao.findById(phoneNo).get();
		} catch (Exception e) {
			throw new InvalidException("No admin has found :" + phoneNo);
		}
		if (log != null) {
			if (log.getPassword().equals(password))
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public void updatePassword(String password, String phoneNo) {
		admin.updatePassword(password, phoneNo);
	}

}
