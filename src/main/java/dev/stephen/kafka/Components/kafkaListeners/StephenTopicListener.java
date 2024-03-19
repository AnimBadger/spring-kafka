package dev.stephen.kafka.Components.kafkaListeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class StephenTopicListener {
    @KafkaListener(topics = "stephenTopic", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: " + data);
    }
}
