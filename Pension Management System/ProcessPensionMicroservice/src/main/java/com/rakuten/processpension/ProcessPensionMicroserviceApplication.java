package com.rakuten.processpension;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProcessPensionMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessPensionMicroserviceApplication.class, args);
	}

}
