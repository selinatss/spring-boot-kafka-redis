package com.project.kafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final String TOPIC = "my_topic";

    @KafkaListener(topics="my_topic", groupId = "my_group_id")
    public void getMessage(String message){
        System.out.println(message);
    }
}
