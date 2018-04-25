package com.dali.consumer

import java.util.Collections

import org.apache.kafka.clients.consumer.KafkaConsumer

import scala.collection.JavaConverters._

object KafkaConsumerApp {

  def main(args: Array[String]): Unit = {

    import java.util.Properties

    val props = new Properties()
    props.put("bootstrap.servers", "localhost:9092")
    props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props.put("group.id", "test")

    val consumer = new KafkaConsumer[String, String](props)

    consumer.subscribe(Collections.singletonList("my-topic"))

    while (true) {
      val records = consumer.poll(100)
      for (record <- records.asScala) {
        println(record)
      }
    }
  }
}
