# KafkaHalloWorld
This is a basic kafka project writen in Scala.

Before you start running the project you should have Docker already installed or You have the Kafka installed locally.


In the case of docker you can follow this steps :

1.Open a new Terminal and run the command:

```
docker run --rm -p 2181:2181 -p 3030:3030 -p 8081-8083:8081-8083 -p 9581-9585:9581-9585 -p 9092:9092 -e ADV_HOST=127.0.0.1  landoop/fast-data-dev:latest

````

2. After that just open an other Tab :

```
run --rm -it --net=host landoop/fast-data-dev bash

kafka-topics --zookeeper localhost:2181  --describe --topic my-topic

```

3. Now just run the KafkaConsumerApp class and after that run the KafkaProducerApp class.


You should get as result in the consumer terminal :

```
ConsumerRecord(topic = my-topic, partition = 0, offset = 5450, CreateTime = 1524656785394, serialized key size = 1, serialized value size = 12, headers = RecordHeaders(headers = [], isReadOnly = false), key = 1, value = MyMessage: 1)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5451, CreateTime = 1524656785405, serialized key size = 1, serialized value size = 12, headers = RecordHeaders(headers = [], isReadOnly = false), key = 2, value = MyMessage: 2)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5452, CreateTime = 1524656785405, serialized key size = 1, serialized value size = 12, headers = RecordHeaders(headers = [], isReadOnly = false), key = 3, value = MyMessage: 3)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5453, CreateTime = 1524656785405, serialized key size = 1, serialized value size = 12, headers = RecordHeaders(headers = [], isReadOnly = false), key = 4, value = MyMessage: 4)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5454, CreateTime = 1524656785405, serialized key size = 1, serialized value size = 12, headers = RecordHeaders(headers = [], isReadOnly = false), key = 5, value = MyMessage: 5)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5455, CreateTime = 1524656785406, serialized key size = 1, serialized value size = 12, headers = RecordHeaders(headers = [], isReadOnly = false), key = 6, value = MyMessage: 6)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5456, CreateTime = 1524656785406, serialized key size = 1, serialized value size = 12, headers = RecordHeaders(headers = [], isReadOnly = false), key = 7, value = MyMessage: 7)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5457, CreateTime = 1524656785406, serialized key size = 1, serialized value size = 12, headers = RecordHeaders(headers = [], isReadOnly = false), key = 8, value = MyMessage: 8)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5458, CreateTime = 1524656785406, serialized key size = 1, serialized value size = 12, headers = RecordHeaders(headers = [], isReadOnly = false), key = 9, value = MyMessage: 9)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5459, CreateTime = 1524656785406, serialized key size = 2, serialized value size = 13, headers = RecordHeaders(headers = [], isReadOnly = false), key = 10, value = MyMessage: 10)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5460, CreateTime = 1524656785406, serialized key size = 2, serialized value size = 13, headers = RecordHeaders(headers = [], isReadOnly = false), key = 11, value = MyMessage: 11)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5461, CreateTime = 1524656785406, serialized key size = 2, serialized value size = 13, headers = RecordHeaders(headers = [], isReadOnly = false), key = 12, value = MyMessage: 12)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5462, CreateTime = 1524656785406, serialized key size = 2, serialized value size = 13, headers = RecordHeaders(headers = [], isReadOnly = false), key = 13, value = MyMessage: 13)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5463, CreateTime = 1524656785406, serialized key size = 2, serialized value size = 13, headers = RecordHeaders(headers = [], isReadOnly = false), key = 14, value = MyMessage: 14)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5464, CreateTime = 1524656785406, serialized key size = 2, serialized value size = 13, headers = RecordHeaders(headers = [], isReadOnly = false), key = 15, value = MyMessage: 15)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5465, CreateTime = 1524656785406, serialized key size = 2, serialized value size = 13, headers = RecordHeaders(headers = [], isReadOnly = false), key = 16, value = MyMessage: 16)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5466, CreateTime = 1524656785406, serialized key size = 2, serialized value size = 13, headers = RecordHeaders(headers = [], isReadOnly = false), key = 17, value = MyMessage: 17)
ConsumerRecord(topic = my-topic, partition = 0, offset = 5467, CreateTime = 1524656785406, serialized key size = 2, serialized value size = 13, headers = RecordHeaders(headers = [], isReadOnly = false), key = 18, value = MyMessage: 18)

```