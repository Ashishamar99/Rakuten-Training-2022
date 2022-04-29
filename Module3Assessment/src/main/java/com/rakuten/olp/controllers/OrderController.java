package com.rakuten.olp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.rakuten.olp.entities.Order;
import com.rakuten.olp.services.OrderService;

@RestController
@RequestMapping("/olp")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@PostMapping("/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	void saveOrder(@RequestBody Order order) {
		service.createOrder(order);
	}
	
	@GetMapping
	List<Order> getOrders(){
		return service.getAllOrders();
	}
	
	@GetMapping("/fetch/{order_id}")
	Optional<Order> getOrderById(@PathVariable Integer order_id) {
		return service.getOrderByOrderId(order_id);
	}
	
	@GetMapping("/fetch/latest")
	Order getLatestOrder() {
		return service.getLatestOrder();
	}
	
	@GetMapping("fetchByCustomerId/{customer_id}")
	List<Order> getOrdersByCustomerId(@PathVariable Integer customer_id){
		return service.getAllOrdersByCustomerId(customer_id);
	}
}
