package com.dali.producer

import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, Producer, ProducerConfig, ProducerRecord}

class KafkaProducerApp {

  val properties = new Properties()

  properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092")
  properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")
  properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")

  var producer: Producer[String, String] = new KafkaProducer[String, String](properties)

  def send(): Unit =
    try {
      (1 to 5).foreach(i =>
        producer.send(new ProducerRecord[String, String]("my-topic", i.toString, "MyMessage: " + i.toString)))
    } catch {
      case e: Exception => println(e)
    } finally
      producer.close()

}

