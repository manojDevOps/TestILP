package com.ilp.sumatra.core;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.ilp.sumatra.core.producer.HelloKafkaProducer;
import com.ilp.sumatra.core.service.JSONConverterService;
import com.ilp.sumatra.core.service.JSONConverterServiceImpl;

/**
 * @author 518943
 *
 */
public class MainApp {

	static final Logger logger = Logger.getLogger(MainApp.class);

	/**
	 * @param args
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static void main(String args[]) throws JsonParseException, JsonMappingException, IOException {

		logger.debug("Main Method Start");

		JSONConverterService convertData = new JSONConverterServiceImpl();
		List<String> kafkaMessages = convertData.formatData();
		int size = kafkaMessages.size();
		
		for(int i=0;i<size;i++)
		{
			String message = kafkaMessages.get(i);
			HelloKafkaProducer.createProducer(message);
		}

		logger.debug("Main Method End");
	}

}