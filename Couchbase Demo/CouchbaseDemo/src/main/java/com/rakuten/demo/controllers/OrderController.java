package com.rakuten.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.demo.entities.Order;
import com.rakuten.demo.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@GetMapping
	public List<Order> getOrders() {
		return orderService.getAllOrders();
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void saveOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
	}
}
