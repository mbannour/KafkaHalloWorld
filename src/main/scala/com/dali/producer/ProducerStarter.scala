package com.dali.producer

object ProducerStarter extends App {

  val producer = new KafkaProducerApp()

  producer.send()
}
