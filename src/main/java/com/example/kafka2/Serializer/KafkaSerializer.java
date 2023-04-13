package com.example.kafka2.Serializer;

import org.apache.kafka.common.serialization.Serializer;
import proto.Person;

public class KafkaSerializer implements Serializer<Person>
{

    @Override
    public byte[] serialize(String topic, Person data) {
        return data.toByteArray();
    }
}
