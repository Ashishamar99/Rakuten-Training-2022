package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.Order;

@Service
public class ProducerString {
	
	@Autowired
	private KafkaTemplate<String, String> template; // This takes in the name of the topic and the type of the message.
	
	public void publishToTopic(String topicName, String message) {
		System.out.println(String.format("Publishing to topic:: %s, Order = %s", topicName, message));
		this.template.send(topicName, message);
	}
}
