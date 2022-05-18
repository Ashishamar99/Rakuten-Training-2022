package com.rakuten.demo.repositories;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.rakuten.demo.entities.Order;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "order")
public interface OrderRepository extends CouchbaseRepository<Order, Integer>{

}
