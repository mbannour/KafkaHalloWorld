package com.dali.producer

import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

object KafkaProducerApp extends App {

  val properties = new Properties()

  properties.put("bootstrap.servers", "localhost:9092")
  properties.put("key.serialization", "org.apache.kafka.serialization.StringSerializer")
  properties.put("value.serialization", "org.apache.kafka.serialization.StringSerializer")

  val producer = new KafkaProducer[String, String](properties)
  val producerRecord = new ProducerRecord("my-topic", "Course-001", "my message")

  try {
    producer.send(producerRecord)
  } catch {
    case e: Exception => println("" + e)
  } finally {
    producer.close()
  }

}
