package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	List<Order> orders = new ArrayList<>();
	void save(Order order) {
		orders.add(order);
	}
	public List<Order> getAllOrders() {
		return orders;
	}
	
	
}
