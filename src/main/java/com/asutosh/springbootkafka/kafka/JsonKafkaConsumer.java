package com.asutosh.springbootkafka.kafka;

import com.asutosh.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class JsonKafkaConsumer {

//    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    private  static  final Logger LOGGER=  LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "AsuKafkaTopic_json" , groupId = "myGroup" )
    public  void consume(User message){
        LOGGER.info(String.format("JSON Message received successfully -> %s" , message.toString()));
    }
}
