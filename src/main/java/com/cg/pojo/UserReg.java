package com.cg.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Register")
public class UserReg {

	@Id
	@Column(length = 10)
	private String phoneNo;
	@Column(length = 30)
	private String bloodGroup;
	@Column(length = 15)
	private String name;
	@Column(length = 30)
	private String email;
	@Column(length = 30)
	private String password;
	@Column(length = 30)
	private String location;

	public UserReg() {
	}

	public UserReg(String phoneNo, String bloodGroup, String location, String name, String email, String password) {
		super();
		this.phoneNo = phoneNo;
		this.bloodGroup = bloodGroup;
		this.location = location;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "UserRegistration [phoneNo=" + phoneNo + ", bloodGroup=" + bloodGroup + ", name=" + name + ", email="
				+ email + ", password=" + password + ", location=" + location + "]";
	}

}
