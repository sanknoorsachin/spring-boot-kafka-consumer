package com.example.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafka.consumer.model.UserDetails;

@Service
public class KakfaConsumer {
	
	@KafkaListener(topics="kafka_topic", groupId="group_id")
	public void consumer(String message) {
		System.out.println("consumed messages:"+message);
	}
	@KafkaListener(topics = "Kafka_Example_json", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(UserDetails user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
