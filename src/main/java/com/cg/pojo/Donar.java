package com.cg.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Donor")
@SequenceGenerator(name = "seqence", initialValue = 100, allocationSize = 1)
public class Donar {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqence")
	@Column(length = 10)
	private int donarId;
	@Column(length = 10)
	private int pId;
	@Column(length = 30)
	private String pName;
	@Column(length = 15)
	private String phNo;
	@Column(length = 30)
	private String plocation;
	@Column(length = 30)
	private String donarName;
	@Column(length = 30)
	private String donarPhoneNo;
	@Column(length = 30)
	private String donarBg;
	@Column(length = 30)
	private String status;

	public Donar() {
	}

	public Donar(int donarId, int pId, String pName, String phNo, String donarBg, String plocation, String donarName,
			String donarPhoneNo, String status) {
		super();
		this.donarId = donarId;
		this.pId = pId;
		this.pName = pName;
		this.phNo = phNo;
		this.plocation = plocation;
		this.donarBg = donarBg;
		this.donarName = donarName;
		this.donarPhoneNo = donarPhoneNo;
		this.status = status;
	}

	public int getDonarId() {
		return donarId;
	}

	public void setDonarId(int donarId) {
		this.donarId = donarId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getPlocation() {
		return plocation;
	}

	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}

	public String getDonarName() {
		return donarName;
	}

	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}

	public String getDonarPhoneNo() {
		return donarPhoneNo;
	}

	public void setDonarPhoneNo(String donarPhoneNo) {
		this.donarPhoneNo = donarPhoneNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDonarBg() {
		return donarBg;
	}

	public void setDonarBg(String donarBg) {
		this.donarBg = donarBg;
	}

	@Override
	public String toString() {
		return "Donar [donarId=" + donarId + ", pId=" + pId + ", pName=" + pName + ", phNo=" + phNo + ", plocation="
				+ plocation + ", donarName=" + donarName + ", donarPhoneNo=" + donarPhoneNo + ", donarBg=" + donarBg
				+ ", status=" + status + "]";
	}

}