package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.UserLoginDao;
import com.cg.dao.UserRegDao;
import com.cg.pojo.UserReg;

@Service
@Transactional
public class UserRegServiceImpl implements UserRegService {

	@Autowired
	private UserRegDao dao;

	@Autowired
	private UserLoginDao user;

	@Override
	public boolean register(UserReg reg) {
		if (!dao.existsById(reg.getPhoneNo())) {
			dao.save(reg);
			return true;
		} else
			return false;
	}

	@Override
	public boolean login(String phoneNo, String password) throws InvalidException {
		UserReg log;
		try {
			log = dao.findById(phoneNo).get();
		} catch (Exception e) {
			throw new InvalidException("No User has found :" + phoneNo);
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
	public List<String> getLocation() {
		return user.getLocation();
	}

	@Override
	public List<String> findByUserLocation(String location) {
		return user.findByLocation(location);
	}

	@Override
	public List<String> getName(String pphoneNo) {
		return user.getName(pphoneNo);
	}

	@Override
	public List<String> findName() {
		return user.findName();
	}

	@Override
	public List<String> findByName(String name) {
		return user.findByName(name);
	}

	@Override
	public List<String> findByBloodGroup(String bloodGroup) {
		return user.findByBloodGroup(bloodGroup);
	}

	@Override
	public void updateUserPassword(String password, String phoneNo) {
		user.updateUserPassword(password, phoneNo);
	}

}
