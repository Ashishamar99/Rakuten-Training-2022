package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.example.demo.service.ContactService;
import com.example.demo.templates.ContactUs;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	ContactService contact_service;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void sendMessage(@RequestBody ContactUs message) {
		contact_service.send(message);
	}
	

}
