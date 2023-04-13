package com.example.kafka2;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig
{
@Bean
public NewTopic myTopic()
{
    return TopicBuilder.name("My Topic Name -->")
    		//.partitions(2)   splitting topics into partitions
            .build();
}
}
