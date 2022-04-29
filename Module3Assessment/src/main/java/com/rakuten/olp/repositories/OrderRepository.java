package com.rakuten.olp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.olp.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

	Order findFirstByOrderByIdDesc(); //This link shows us how to use keywords in JPA --> https://stackoverflow.com/questions/2061068/jpa-find-the-last-entry

	List<Order> findAllBycustomerId(Integer customer_id);

}
