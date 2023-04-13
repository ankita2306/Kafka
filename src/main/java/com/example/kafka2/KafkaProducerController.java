package com.example.kafka2;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.kafka2.kafka.KafkaProducer;
import proto.Person;


@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaProducerController 
{
	
	private KafkaProducer kafkaProducer;

	public KafkaProducerController(KafkaProducer kafkaProducer) 
	{

		this.kafkaProducer = kafkaProducer;
	}

	//http:localhost:8080/api/v1/kafka/publish?message=hello
	
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message)
	{
		Person person1 = Person.newBuilder().setEmail("huhu@pl").build();

		kafkaProducer.sendMessage();
		return ResponseEntity.ok("Message sent to the topic");
	}
		


}

