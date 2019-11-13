package com.cg.service;

import java.util.List;

import com.cg.pojo.PatientReg;

public interface PatientService {

	boolean register(PatientReg pat);

	List<PatientReg> getAllPatient();

	List<String> getLocation();

	List<Integer> getPatientId();

	List<PatientReg> findById(int patientId);

	List<String> findName();

	void deletePatient(int id);

	List<PatientReg> findByName(String name);

	List<PatientReg> findByLocation(String location);
}
