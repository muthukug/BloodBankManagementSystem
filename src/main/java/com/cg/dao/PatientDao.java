package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.pojo.PatientReg;

@Repository
public interface PatientDao extends JpaRepository<PatientReg, Integer> {

	public List<PatientReg> findByLocation(String location);

	@Query("SELECT DISTINCT(s.location) FROM PatientReg s")
	List<String> getLocation();

	@Query("SELECT DISTINCT(r.patientId) FROM PatientReg r")
	List<Integer> getPatientId();

	@Query("SELECT DISTINCT(n.name) FROM PatientReg n")
	List<String> findName();

	public List<PatientReg> findById(int patientId);

	public List<PatientReg> findByName(String name);
}
