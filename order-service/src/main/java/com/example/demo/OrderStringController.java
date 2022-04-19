package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Producer;
import com.example.demo.service.ProducerString;

@RestController
@RequestMapping("/order2")
public class OrderStringController {
	
	@Autowired
	ProducerString producer;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void sendMessage(@RequestParam("name") String name, @RequestParam("price") Float price) {
		String ordermessage = String.valueOf(new Order(name, price));
		System.out.println(ordermessage + "===================OrderMessage");
		String topicName = "NormalPost";
		if(price>100)
			topicName = "SpeedPost";
		producer.publishToTopic(topicName, ordermessage);
	}

}
