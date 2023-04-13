package com.example.kafka2.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;


import com.example.kafka2.utils.AppConstant;

import proto.Person;

@Service
public class KafkaProducer
{
	
	private static final Logger LOGGER=LoggerFactory.getLogger(KafkaProducer.class);
	/*
	 * public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) { super();
	 * this.kafkaTemplate = kafkaTemplate; }
	 */
	@Autowired
	private KafkaTemplate<String, Person> kafkaTemplate;

 public void sendMessage()
 {
	 Person person1 = Person.newBuilder().setEmail("example@yahoo.com").setName("ABC").setId(112).build();

	 kafkaTemplate.send("ankita",person1);
	 LOGGER.info(String.format("Message sent->  %s", person1));
	 
 }
 
}
