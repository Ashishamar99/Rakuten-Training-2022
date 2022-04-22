package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@PostMapping("/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	void makeAppointment(@RequestBody String s) {
		
	}
	
}
