package com.asutosh.springbootkafka.controller;

import com.asutosh.springbootkafka.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/kafka")
public class MessageController {

    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

//    localhost:8080/api/v1/kafka/publish?mes= hello universe
    @GetMapping("publish")
    public ResponseEntity<String> publish(@RequestParam("mes") String message){
     kafkaProducer.sendMessage(message);
     return ResponseEntity.ok("Message sent to the topic");
    }
}
