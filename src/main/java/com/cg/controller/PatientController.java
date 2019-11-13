package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pojo.PatientReg;
import com.cg.service.PatientService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class PatientController {

	PatientReg register;

	@Autowired
	private PatientService service;

	@PostMapping(value = "/patientreg", consumes = "application/json")
	public void register(@RequestBody PatientReg pat) {
		service.register(pat);

	}

	@GetMapping("/getAllPatient")
	public List<PatientReg> getAllPatient() {
		return service.getAllPatient();
	}

	@DeleteMapping("/deletePatient/{id}")
	public void deletePatient(@PathVariable int id) {
		service.deletePatient(id);
	}

	@GetMapping("/findByLocation/{location}")
	public List<PatientReg> findByLocation(@PathVariable("location") String location) {
		return service.findByLocation(location);
	}

	@GetMapping("/getLocation")
	public List<String> getLocation() {
		return service.getLocation();
	}

	@GetMapping("/getPatientId")
	public List<Integer> getPatientId() {
		return service.getPatientId();
	}

	@GetMapping("/findById/{patientId}")
	public List<PatientReg> findById(@PathVariable("patientId") Integer patientId) {
		return service.findById(patientId);
	}

	@GetMapping("/findPatName")
	public List<String> findName() {
		return service.findName();
	}

	@GetMapping("/findByPatName/{name}")
	public List<PatientReg> findByName(@PathVariable("name") String name) {
		return service.findByName(name);
	}
}
