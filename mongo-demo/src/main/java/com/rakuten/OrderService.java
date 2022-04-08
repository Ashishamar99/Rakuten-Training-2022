package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	List<Order> orders = new ArrayList<>();
	void save(Order order) {
		orderRepository.save(order);
	}
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}
	
	
}
