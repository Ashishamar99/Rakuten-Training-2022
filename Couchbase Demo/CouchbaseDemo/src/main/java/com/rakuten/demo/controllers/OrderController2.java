package com.rakuten.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.demo.repositories.OrderRepository;

@RestController
@RequestMapping("/couchorders")
public class OrderController2 {
	
	@Autowired
	OrderRepository repo;
	
	@GetMapping("/getAllOrders")
	public String getOrders() {
		System.out.println(repo.findAll());
		return "printed";
	}
}
