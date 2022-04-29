package com.rakuten.olp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.olp.entities.Order;
import com.rakuten.olp.entities.OrderStatus;
import com.rakuten.olp.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repository;

	public void createOrder(Order order) {
		//order.setOrderStatus(Enum.valueOf(OrderStatus.class, String.valueOf(order.getOrderStatus()).toUpperCase()));
		repository.save(order);
	}

	public List<Order> getAllOrders() {
		return repository.findAll();
	}

	public Optional<Order> getOrderByOrderId(Integer order_id) {
		return repository.findById(order_id);
	}
	
	public Order getLatestOrder() {
		return repository.findFirstByOrderByIdDesc();
	}

	public List<Order> getAllOrdersByCustomerId(Integer customer_id) {
		return repository.findAllBycustomerId(customer_id);
	}
	
	public List<Order> getAllOrdersByStoreId(Integer store_id){
		return repository.findAllBystoreId(store_id);	
	}
	
}
