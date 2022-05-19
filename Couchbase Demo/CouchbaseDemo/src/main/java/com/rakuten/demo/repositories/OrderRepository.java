package com.rakuten.demo.repositories;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.rakuten.demo.entities.Order;

@Repository
public interface OrderRepository extends CouchbaseRepository<Order, String>{

}
