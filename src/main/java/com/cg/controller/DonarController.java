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

import com.cg.pojo.Donar;
import com.cg.service.DonarService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DonarController {

	@Autowired
	private DonarService service;

	@PostMapping(value = "/donarreg", consumes = "application/json")
	public void donarreg(@RequestBody Donar dow) {
		service.register(dow);

	}

	@GetMapping("/getAllDonar")
	public List<Donar> getAllDonar() {
		return service.getAllDonar();
	}

	@DeleteMapping("/deleteDonar/{id}")
	public void deleteDonar(@PathVariable int id) {
		service.deleteDonar(id);
	}

	@GetMapping("/findBydonarPhoneNo/{donarPhoneNo}")
	public List<Donar> findBydonarPhoneNo(@PathVariable("donarPhoneNo") String donarPhoneNo) {
		return service.findBydonarPhoneNo(donarPhoneNo);
	}

	@GetMapping(value = "/updateDonarStatus/{status}/{donarId}")
	public void updateDonarStatus(@PathVariable("status") String status, @PathVariable("donarId") int donarId) {
		service.updateDonarStatus(status, donarId);
	}

}
