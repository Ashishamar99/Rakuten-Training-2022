package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.Order;

@Service
public class Consumer {
	@KafkaListener(topics={"SpeedPost", "NormalPost"})
	public void consumeFromTopic(String message) {
		System.out.println("Consumed Message:: " + message);
	}
}
