package com.project.kafka;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private KafkaProducer producer;

    public KafkaController(KafkaProducer kafkaProducer){
        this.producer = kafkaProducer;
    }

    @PostMapping("/publish")
    public void writeMessageToTopic(@RequestParam("message") String message){
        producer.writeMessage(message);
    }
}
