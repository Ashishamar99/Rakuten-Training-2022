package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repository;
	
	void saveOrder(Order order) {
		repository.save(order);
		System.out.println("Order is saved in the repository.");
	}
}
