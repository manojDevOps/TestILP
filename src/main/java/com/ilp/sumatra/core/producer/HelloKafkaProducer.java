package com.ilp.sumatra.core.producer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;


/**
 * @author 518943
 *
 */
public class HelloKafkaProducer {
	static InputStream kafkaProperties = null;

	public static void createProducer(String kafkaMessage) {
		try {
			Properties props = new Properties();
			kafkaProperties = new FileInputStream("kafka.properties");

			// load a properties file
			props.load(kafkaProperties);

			ProducerConfig config = new ProducerConfig(props);
			Producer<String, String> producer = new Producer<String, String>(config);

			producer.send(new KeyedMessage<String, String>(props.getProperty("kafka.topic"), kafkaMessage));
			producer.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (kafkaProperties != null) {
				try {
					kafkaProperties.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}