package com.fitnesstracker.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitnesstracker.demo.entities.ContactUs;
import com.fitnesstracker.demo.repositories.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository contact_repository;

	public void send(ContactUs message) {
		contact_repository.save(message);
		
	}

	public List<ContactUs> getAllContacts() {
		return contact_repository.findAll();
	}

}
