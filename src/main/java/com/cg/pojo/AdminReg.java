package com.cg.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "Admin")
public class AdminReg {

	@Id
	@Column(length = 15)
	private String phoneNo;
	@Column(length = 30)
	private String password;
	@Column(length = 15)
	private String name;
	@Column(length = 10)
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "AdminReg [userName=" + userName + ", password=" + password + ", name=" + name + ", phoneNo=" + phoneNo
				+ "]";
	}

	public AdminReg() {

	}

	public AdminReg(String userName, String password, String name, String phoneNo) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.phoneNo = phoneNo;
	}

}
