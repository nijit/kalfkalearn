package com.nijit.test.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerListener {

    @KafkaListener(topics = "nijit-topic", groupId = "nijit-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
