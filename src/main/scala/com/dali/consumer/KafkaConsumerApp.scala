package com.dali.consumer

import java.util.Collections

import org.apache.kafka.clients.consumer.{ConsumerConfig, KafkaConsumer}
import java.util.Properties
import scala.collection.JavaConverters._

object KafkaConsumerApp extends App {

  val properties = new Properties()
  properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
  properties.put(
    ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
    "org.apache.kafka.common.serialization.StringDeserializer"
  )
  properties.put(
    ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
    "org.apache.kafka.common.serialization.StringDeserializer"
  )
  properties.put(ConsumerConfig.GROUP_ID_CONFIG, "test")

  val consumer = new KafkaConsumer[String, String](properties)

  consumer.subscribe(Collections.singletonList("my-topic"))

  try {
    while (true) {
      val records = consumer.poll(100)
      records.asScala.foreach { record =>
        println(record)
      }
    }
  } catch {
    case e: Exception => println(e.getMessage)
  } finally {
    consumer.close()
  }
}
