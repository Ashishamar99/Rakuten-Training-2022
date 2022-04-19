package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/order")
	void createOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
	}

}
