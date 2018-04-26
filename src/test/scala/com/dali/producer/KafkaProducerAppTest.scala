package com.dali.producer

import java.util

import org.apache.kafka.clients.producer.{MockProducer, ProducerRecord}
import org.apache.kafka.common.serialization.StringSerializer
import org.scalatest.{FlatSpec, Matchers}

class KafkaProducerAppTest extends FlatSpec with Matchers {

  private val topic = "my-topic"

  val producer = new MockProducer[String, String](true, new StringSerializer(), new StringSerializer())

  val myTestKafkaProducer = new KafkaProducerApp()

  myTestKafkaProducer.producer = producer

  myTestKafkaProducer.send()

  val history = producer.history

  val expected = util.Arrays.asList(
    new ProducerRecord[String, String](topic, "1", "MyMessage: 1"),
    new ProducerRecord[String, String](topic, "2", "MyMessage: 2"),
    new ProducerRecord[String, String](topic, "3", "MyMessage: 3"),
    new ProducerRecord[String, String](topic, "4", "MyMessage: 4"),
    new ProducerRecord[String, String](topic, "5", "MyMessage: 5")
  )

  "producer" should "Sent the expected messages" in {
    expected should ===(history)
  }

}
