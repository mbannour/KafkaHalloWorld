package com.dali.producer

import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig, ProducerRecord}

object KafkaProducerApp extends App {

  val properties = new Properties()

  properties.put("bootstrap.servers", "127.0.0.1:9092")
  properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")
  properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")

  val producer = new KafkaProducer[String, String](properties)
  val producerRecord = new ProducerRecord("my-topic", "Course", "my message")

  try {

    (1 to 200).foreach { i =>
      producer.send(new ProducerRecord[String, String]("my-topic", i.toString, "MyMessage: " + i.toString))
    }
  } catch {
    case e: Exception => println("" + e)
  } finally {
    producer.close()
  }

}
