package com.fitnesstracker.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fitnesstracker.demo.entities.ContactUs;
import com.fitnesstracker.demo.service.ContactService;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/v1.0/fitnesstracker/contacts")
public class ContactController {
	
	@Autowired
	ContactService contact_service;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void sendMessage(@RequestBody ContactUs message) {
		contact_service.send(message);
	}
	
	@GetMapping
	List<ContactUs> getAllMessages() {
		return contact_service.getAllContacts();
	}

}
