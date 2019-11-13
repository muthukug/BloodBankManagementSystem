package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pojo.UserReg;
import com.cg.service.InvalidException;
import com.cg.service.UserRegService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserRegController {

	UserReg register;
	@Autowired
	private UserRegService service;

	@PostMapping(value = "/register", consumes = "application/json")
	public boolean register(@RequestBody UserReg reg) {
		return service.register(reg);
	}

	@GetMapping("/login/{phoneNo}/{password}")
	public boolean login(@PathVariable("phoneNo") String phoneNo, @PathVariable("password") String password) {
		boolean valid = false;
		try {
			valid = service.login(phoneNo, password);
		} catch (InvalidException e) {
			e.getMessage();
		}
		return valid;
	}

	@GetMapping("/getUserLocation")
	public List<String> getLocation() {
		return service.getLocation();
	}

	@GetMapping("/findByUserLocation/{location}")
	public List<String> findByUserLocation(@PathVariable("location") String location) {
		return service.findByUserLocation(location);
	}

	@GetMapping(value = "/getName/{phoneNum}")
	public List<String> getName(@PathVariable("phoneNum") String phoneNum) {
		return service.getName(phoneNum);

	}

	@GetMapping("/findName")
	public List<String> findName() {
		return service.findName();
	}

	@GetMapping("/findByName/{name}")
	public List<String> findByName(@PathVariable("name") String name) {
		return service.findByName(name);
	}

	@GetMapping("/findByBloodGroup/{bloodGroup}")
	public List<String> findByBloodGroup(@PathVariable("bloodGroup") String bloodGroup) {
		return service.findByBloodGroup(bloodGroup);
	}

	@GetMapping("/updateUserPassword/{phoneNo}/{password}")
	public void updateUserPassword(@PathVariable("phoneNo") String phoneNo, @PathVariable("password") String password) {
		service.updateUserPassword(password, phoneNo);
	}
}
