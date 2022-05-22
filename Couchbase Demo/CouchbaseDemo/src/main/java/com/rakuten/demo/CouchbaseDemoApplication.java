package com.rakuten.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.couchbase.core.CouchbaseOperations;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.data.couchbase.repository.query.CouchbaseEntityInformation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.couchbase.client.java.query.QueryScanConsistency;
import com.rakuten.demo.controllers.OrderController;
import com.rakuten.demo.entities.Order;
import com.rakuten.demo.repositories.OrderRepository;

@SpringBootApplication
public class CouchbaseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouchbaseDemoApplication.class, args);
	}

}
