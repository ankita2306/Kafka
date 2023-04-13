package com.example.kafka2.kafka;

import com.example.kafka2.utils.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import proto.Person;


@Service
public class KafkaConsumer 
{
	  private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

	    @KafkaListener(topics = AppConstant.TOPIC_NAME,
	                    groupId = AppConstant.GROUP_ID)
	    public void consume(Person message){
	        LOGGER.info(String.format("Message received -> %s", message));
	    }
}
