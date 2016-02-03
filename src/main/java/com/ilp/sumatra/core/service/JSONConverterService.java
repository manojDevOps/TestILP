package com.ilp.sumatra.core.service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ilp.sumatra.core.CourseSection;

/**
 * @author 518943
 *
 */
public interface JSONConverterService {

	public List<String> getJSONListfromCSV();

	public List<String> csvJsonToKafkaMessages(List<String> jsonList);

	public String createCourseSectionObject(CourseSection cs, ObjectMapper mapper) throws JsonProcessingException;

	public List<String> formatData();

}
