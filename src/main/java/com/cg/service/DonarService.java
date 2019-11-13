package com.cg.service;

import java.util.List;

import com.cg.pojo.Donar;

public interface DonarService {

	boolean register(Donar dow);

	List<Donar> getAllDonar();

	boolean deleteDonar(int id);

	public List<Donar> findBydonarPhoneNo(String donarPhoneNo);

	public void updateDonarStatus(String status, int donarId);

}
