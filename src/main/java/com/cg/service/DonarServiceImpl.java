package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.DonarDao;
import com.cg.pojo.Donar;

@Service
@Transactional
public class DonarServiceImpl implements DonarService {

	@Autowired
	private DonarDao dao;

	@Override
	public boolean register(Donar dow) {
		dao.save(dow);
		return true;
	}

	@Override
	public List<Donar> getAllDonar() {
		List<Donar> lists = dao.findAll();
		return lists;
	}

	@Override
	public boolean deleteDonar(int id) {
		dao.deleteById(id);
		return false;
	}

	@Override
	public List<Donar> findBydonarPhoneNo(String donarPhoneNo) {
		return dao.findBydonarPhoneNo(donarPhoneNo);
	}

	@Override
	public void updateDonarStatus(String status, int donarId) {
		dao.updateDonarStatus(status, donarId);
	}

}
