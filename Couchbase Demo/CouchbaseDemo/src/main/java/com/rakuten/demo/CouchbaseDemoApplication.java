package com.rakuten.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.rakuten.demo.controllers.OrderController;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {"com.rakuten.demo.repositories"})
public class CouchbaseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouchbaseDemoApplication.class, args);
	}

}
