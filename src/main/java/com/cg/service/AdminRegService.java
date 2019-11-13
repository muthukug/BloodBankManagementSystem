package com.cg.service;

import com.cg.pojo.AdminReg;

public interface AdminRegService{

	Boolean adminregister(AdminReg reg);
	
	boolean adminlogin(String phoneNo, String password) throws InvalidException;
	
	void updatePassword(String password, String phoneNo);
}
