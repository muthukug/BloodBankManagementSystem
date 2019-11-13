package com.cg.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Patient")
@SequenceGenerator(name = "seq", initialValue = 1000, allocationSize = 1)
public class PatientReg {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(length = 10)
	private int patientId;
	@Column(length = 30)
	private String name;
	@Column(length = 15)
	private String phoneNo;
	@Column(length = 30)
	private String location;
	@Column(length = 30)
	private String bloodGroup;

	public PatientReg() {

	}

	public PatientReg(int patientId, String name, String phoneNo, String location, String bloodGroup) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.location = location;
		this.phoneNo = phoneNo;
		this.bloodGroup = bloodGroup;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "PatientReg [patientId=" + patientId + ", name=" + name + ", phoneNo=" + phoneNo + ", location="
				+ location + ", bloodGroup=" + bloodGroup + "]";
	}

}
