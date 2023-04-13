package com.example.kafka2.Serializer;

import com.google.protobuf.InvalidProtocolBufferException;
import org.apache.kafka.common.serialization.Deserializer;
import proto.Person;

public class KafkaDeserialiser implements Deserializer<Person> {


    @Override
    public Person deserialize(String topic, byte[] data) {
        try {
           return Person.parseFrom(data);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);

        }
    }
}