package com.cg.service;

import java.util.List;

import com.cg.pojo.UserReg;

public interface UserRegService {

	boolean register(UserReg reg);

	boolean login(String phoneNo, String password) throws InvalidException;

	List<String> getLocation();

	List<String> findName();

	List<String> findByUserLocation(String location);

	List<String> findByName(String name);

	List<String> findByBloodGroup(String bloodGroup);

	public List<String> getName(String pphoneNo);

	void updateUserPassword(String password, String phoneNo);

}
