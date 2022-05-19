package com.rakuten.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.rakuten.demo.entities.Order;
import com.rakuten.demo.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	public void saveOrder(Order order) {
		orderRepository.save(order);
		
	}

	public void deleteAll() {
		orderRepository.deleteAll();
	}

	public void updateOrderFromId(Integer id, Order order) {
		Optional<Order> searchResult = orderRepository.findById(id);
		if(searchResult.isPresent()) {
			order.setId(id);
			orderRepository.save(order);
		}
		else {
			throw new IllegalArgumentException("Whup! Order Not Found. Please Check The Id.");
		}
	}

	public void updateOrderName(Integer id, String name) {
		Optional<Order> searchResult = orderRepository.findById(id);
		if(searchResult.isPresent()) {
			Order myOrder = searchResult.get();
			myOrder.setId(id);
			myOrder.setItem_name(name);
			orderRepository.save(myOrder);
		}
		
		else {
			throw new IllegalArgumentException("Whup! Order Not Found. Please Check The Id.");
		}
		
	}

	public void updateOrderPrice(Integer id, Double price) {
		Optional<Order> searchResult = orderRepository.findById(id);
		if(searchResult.isPresent()) {
			Order myOrder = searchResult.get();
			myOrder.setId(id);
			myOrder.setPrice(price);
			orderRepository.save(myOrder);
		}
		else {
			throw new IllegalArgumentException("Whup! Order Not Found. Please Check The Id.");
		}
		
	}

	public void deleteById(Integer id) {
		if(orderRepository.findById(id).isPresent()) {
			orderRepository.deleteById(id);
		}
		else {
			throw new IllegalArgumentException("Whup! Order Not Found. Please Check The Id.");
		}
	}

	public Order getAllOrdersById(Integer id) {
		Optional<Order> searchResult = orderRepository.findById(id);
		if(searchResult.isPresent()) {
			return searchResult.get();
		}
		else {
			throw new IllegalArgumentException("Whup! Order Not Found. Please Check The Id.");
		}
	}

}
