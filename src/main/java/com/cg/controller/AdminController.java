package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pojo.AdminReg;
import com.cg.service.AdminRegService;
import com.cg.service.InvalidException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AdminController {

	AdminReg register;
	@Autowired
	private AdminRegService service;

	@PostMapping(value = "/adminregister", consumes = "application/json")
	public Boolean adminregister(@RequestBody AdminReg reg) {
		return service.adminregister(reg);

	}

	@GetMapping("/adminlogin/{phoneNo}/{password}")
	public boolean adminlogin(@PathVariable("phoneNo") String phoneNo, @PathVariable("password") String password) {
		boolean valid = false;
		try {
			valid = service.adminlogin(phoneNo, password);
		} catch (InvalidException e) {
			e.getMessage();
		}
		return valid;

	}

	@GetMapping("/updatePassword/{phoneNo}/{password}")
	public void updatePassword(@PathVariable("phoneNo") String phoneNo, @PathVariable("password") String password) {
		service.updatePassword(password, phoneNo);
	}
}
