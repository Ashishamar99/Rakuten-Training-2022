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
		if(order.getDiscount() > 0) {
			order.setDiscountedprice(order.getPrice() - (order.getPrice() * order.getDiscount() / 100) );
		}else {
			order.setDiscountedprice(order.getPrice());
		}
		repository.save(order);
		System.out.println("Order is saved in the repository.");
	}

	public List<Order> getAllOrders() {
		return repository.findAll();
	}
}
