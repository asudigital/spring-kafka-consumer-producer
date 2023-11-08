package com.asutosh.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaTopic(){
       return TopicBuilder.name("AsuKafkaTopic").build();
    }

    @Bean
    public NewTopic javaTopic2(){

        return TopicBuilder.name("AsuKafkaTopic_json").build();
    }
}
