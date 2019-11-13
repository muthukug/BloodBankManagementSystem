package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.PatientDao;
import com.cg.pojo.PatientReg;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao dao;

	@Override
	public boolean register(PatientReg pat) {
		dao.save(pat);
		return true;
	}

	@Override
	public List<PatientReg> getAllPatient() {
		List<PatientReg> lists = dao.findAll();
		return lists;
	}

	@Override
	public void deletePatient(int id) {
		dao.deleteById(id);
	}

	@Override
	public List<PatientReg> findByLocation(String location) {
		return dao.findByLocation(location);
	}

	@Override
	public List<String> getLocation() {
		return dao.getLocation();
	}

	@Override
	public List<Integer> getPatientId() {
		return dao.getPatientId();
	}

	@Override
	public List<PatientReg> findById(int patientId) {
		return dao.findById(patientId);
	}

	@Override
	public List<String> findName() {
		return dao.findName();
	}

	@Override
	public List<PatientReg> findByName(String name) {
		return dao.findByName(name);
	}

}