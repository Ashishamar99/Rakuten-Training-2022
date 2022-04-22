package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.templates.ContactUs;

@Service
public class ContactService {

	public void send(ContactUs message) {
		System.out.println(message);
		
	}

}
