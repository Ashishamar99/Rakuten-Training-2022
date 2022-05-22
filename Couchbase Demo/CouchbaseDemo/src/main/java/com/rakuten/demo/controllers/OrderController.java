package com.rakuten.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.couchbase.client.java.kv.GetResult;
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
	
	@GetMapping("/search/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public Order getOrdersById(@PathVariable String id) {
		return orderService.getAllOrdersById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void saveOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
	}
	
	@DeleteMapping
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void deleteAllOrders() {
		orderService.deleteAll();
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void deleteOrderFromId(@PathVariable String id) {
		orderService.deleteById(id);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String handleIdNotFoundException(IllegalArgumentException ex) {
		return ex.getMessage();
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void updateOrder(@PathVariable String id, @RequestBody Order order) {
		orderService.updateOrderFromId(id, order);
	}
	
	@PatchMapping("/name/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void updateOrderName(@PathVariable String id, @RequestParam String name) {
		orderService.updateOrderName(id, name);
	}
	
	@PatchMapping("/price/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void updateOrderPrice(@PathVariable String id, @RequestParam Double price) {
		orderService.updateOrderPrice(id, price);
	}
}
