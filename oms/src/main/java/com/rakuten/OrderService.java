package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	List<Order> orders = new ArrayList<>();
	
	void save(Order order) {
		System.out.println(order.getItem());
		System.out.println(order.getPrice());
		orders.add(order);
	}

	public List<Order> getOrders() {
		return orders;
	}
}
