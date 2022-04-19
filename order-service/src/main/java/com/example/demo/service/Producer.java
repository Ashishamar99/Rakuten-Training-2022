package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.Order;

@Service
public class Producer {
	
	public static final String normalPost = "NormalPost";
	public static final String speedPost = "SpeedPost";
	
	@Autowired
	private KafkaTemplate<String, Order> template; // This takes in the name of the topic and the type of the message.
	
	public void publishToTopic(Order message) {
		String topicName = normalPost;
		
		if(message.getPrice() > 100)
			topicName = speedPost;
		
		System.out.println(String.format("Publishing to topic:: %s, Order = %s", topicName, message));
		this.template.send(topicName, message);
	}
}
