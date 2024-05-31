package com.nijit.test.controller;

import com.nijit.test.kafka.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class TestController {

    private final KafkaProducerService kafkaProducerService;

    public TestController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @GetMapping("/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        System.out.println("here come : " + message);
        kafkaProducerService.sendMessage("nijit-topic", message);
    }
}
