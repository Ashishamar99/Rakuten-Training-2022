package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.ContactRepository;
import com.example.demo.templates.ContactUs;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository contact_repository;

	public void send(ContactUs message) {
		contact_repository.save(message);
		
	}

}
