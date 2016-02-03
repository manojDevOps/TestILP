package com.ilp.sumatra.core.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.xml.DOMConfigurator;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ilp.sumatra.core.CourseSection;
import com.pearson.daalt.common.MessageTypeCode;
import com.pearson.schema.subpub.CourseSectionSchema;
import com.pearson.schema.subpub.CourseSectionSchema.CourseSectionSourceSystemCode;
import com.pearson.schema.subpub.CourseSectionSchema.CourseSourceSystemCode;
import com.pearson.schema.subpub.CourseSectionSchema.MessageVersion;
import com.pearson.schema.subpub.CourseSectionSchema.TransactionTypeCode;

/**
 * @author 518943
 *
 */
public class JSONConverterServiceImpl implements JSONConverterService {

	static final Logger logger = Logger.getLogger(JSONConverterServiceImpl.class);

	/**
	 * Reading and iterating data over the csv file and returning each JSON
	 * Object as a String List.
	 * 
	 * @return
	 */
	public List<String> getJSONListfromCSV() {

		logger.debug("getJSONListfromCSV method Start");

		String csvFile = "mising_course_sections_112.csv";
		BufferedReader csvReader = null;
		String line = "";
		String formattedJSON = null;
		String value = "Couse_Section_SSRID,Registrar API Response";
		List<String> jsonList = new ArrayList<String>();

		try {

			csvReader = new BufferedReader(new FileReader(csvFile));

			while ((line = csvReader.readLine()) != null) {

				if (!value.equals(line)) {

					String[] jsonData = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
					formattedJSON = jsonData[1].replaceAll("\"\"", "\"");

					formattedJSON = formattedJSON.substring(1, formattedJSON.length() - 1);
					jsonList.add(formattedJSON);
				}
			}

		} catch (FileNotFoundException message) {
			logger.log(Priority.ERROR, message);
		} catch (IOException message) {
			logger.log(Priority.ERROR, message);
		} finally {
			if (csvReader != null) {
				try {
					csvReader.close();
				} catch (IOException message) {
					logger.log(Priority.ERROR, message);
				}
			}
		}
		logger.debug("Successfully executed getJSONListfromCSV method" + jsonList);
		return jsonList;
	}

	/**
	 * Reading the list of Registrar DB JSON Objects (i.e. CSV Records) and
	 * convert it to Kafka formatted messages List.
	 * 
	 * @param jsonList
	 */
	public List<String> csvJsonToKafkaMessages(List<String> jsonList) {

		logger.debug("csvJsonToKafkaMessages method Start");

		int formatted = 0;
		int rejected = 0;
		String kafkaMessage = null;
		List<String> kafkaMessages = new ArrayList<String>();
		ObjectMapper mapper = new ObjectMapper();

		try {
			for (int i = 0; i < jsonList.size(); i++) {
				String jsonString = jsonList.get(i);
				CourseSection courseSection = mapper.readValue(jsonString, CourseSection.class);
				kafkaMessage = createCourseSectionObject(courseSection, mapper);
				boolean flag = validateJSONRecords(courseSection);
				if (!flag) {
					kafkaMessages.add(kafkaMessage);
					formatted++;
					logger.debug("Kafka Formatted Record No: " + formatted + "\n" + kafkaMessage);
				} else {
					rejected++;
					logger.debug("Rejected Record No: " + rejected + " - " + kafkaMessage);
				}

				logger.debug("Source Record!" + courseSection);
			}
		} catch (JsonParseException message) {
			logger.log(Priority.ERROR, message);
		} catch (JsonMappingException message) {
			logger.log(Priority.ERROR, message);
		} catch (IOException message) {
			logger.log(Priority.ERROR, message);
		}

		logger.debug("Total Records Formatted: " + formatted);
		logger.debug("Total Records Rejected: " + rejected);
		logger.debug("csvJsonToKafkaMessages method End");
		logger.debug("==============================");
		logger.debug("Total Kafka Messages" + kafkaMessages);

		return kafkaMessages;
	}

	public boolean emptyCheck(String courseSecObj) {
		
		logger.debug("Entering emptyCheck method");
		
		boolean flag = false;

		if (null == courseSecObj || "N/A".equalsIgnoreCase(courseSecObj) || "".equals(courseSecObj)) {
			flag = true;
		}
		
		logger.debug("Exiting emptyCheck method");
		
		return flag;
	}

	/**
	 * This method will validate and reject the JSON records if it is null or
	 * N/A or empty values.
	 * 
	 * @param cs
	 * @return
	 */
	public boolean validateJSONRecords(CourseSection cs) {
		
		logger.debug("Entering validateJSONRecords method");
		
		boolean flag = false;
		
		if (emptyCheck(cs.getCreatedAt())) {
			flag = true;
			logger.debug("Rejected Reason: Transaction_Datetime is not available");
		} else if (emptyCheck(cs.getId())) {
			flag = true;
			logger.debug("Rejected Reason: Course_Section_Source_System_Record_Id is not available");
		} else if (emptyCheck(cs.getCourseId())) {
			flag = true;
			logger.debug("Rejected Reason: Course_Source_System_Record_Id is not available");
		} else if (emptyCheck(cs.getSectionCode())) {
			flag = true;
			logger.debug("Rejected Reason: Course_Section_Code is not available");
		} else if (emptyCheck(cs.getSectionTitle())) {
			flag = true;
			logger.debug("Rejected Reason: Course_Section_Title is not available");
		}
		logger.debug("Exiting validateJSONRecords method");
		
		return flag;
	}

	/**
	 * Setting registrar db record and default values to Course Section Schema
	 * Object.
	 * 
	 * @param cs
	 * @return
	 * @throws JsonProcessingException
	 */
	public String createCourseSectionObject(CourseSection cs, ObjectMapper mapper) throws JsonProcessingException {

		logger.debug("createCourseSectionObject method Start");

		CourseSectionSchema courseSectionSchema = new CourseSectionSchema();

		courseSectionSchema.setMessageTypeCode(MessageTypeCode.COURSE_SECTION);
		courseSectionSchema.setOriginatingSystemCode(CourseSectionSchema.OriginatingSystemCode.REGISTRAR);
		courseSectionSchema.setMessageVersion(MessageVersion._2_0);
		courseSectionSchema.setTransactionTypeCode(TransactionTypeCode.CREATE);

		if (null != cs.getCreatedAt()) {
			courseSectionSchema.setTransactionDatetime(cs.getCreatedAt().toString());
		}

		courseSectionSchema.setCourseSectionSourceSystemCode(CourseSectionSourceSystemCode.REGISTRAR);

		if (null != cs.getId()) {
			courseSectionSchema.setCourseSectionSourceSystemRecordId(cs.getId().toString());
		}

		courseSectionSchema.setCourseSourceSystemCode(CourseSourceSystemCode.REGISTRAR);

		if (null != cs.getCourseId()) {
			courseSectionSchema.setCourseSourceSystemRecordId(cs.getCourseId());
		}

		if (null != cs.getSectionCode()) {
			courseSectionSchema.setCourseSectionCode(cs.getSectionCode());
		}

		if (null != cs.getSectionTitle()) {
			courseSectionSchema.setCourseSectionTitle(cs.getSectionTitle());
		}

		if (null != cs.getSectionDescription()) {
			courseSectionSchema.setCourseSectionDescription(cs.getSectionDescription());
		}

		if (null != cs.getSectionDetails()) {
			courseSectionSchema.setSectionDetails(cs.getSectionDetails());
		}

		if (null != cs.getEndDate()) {
			courseSectionSchema.setCourseAccessEndDate(cs.getEndDate().toString());
		}

		if (null != cs.getStartDate()) {
			courseSectionSchema.setCourseAccessStartDate(cs.getStartDate().toString());
		}

		if (null != cs.getOpenenrollmentbegins()) {
			courseSectionSchema.setOpenEnrollmentBeginDatetime(cs.getOpenenrollmentbegins());
		}

		if (null != cs.getOpenenrollmentends()) {
			courseSectionSchema.setOpenEnrollmentEndDatetime(cs.getOpenenrollmentends());
		}

		if (null != cs.getSectionSchedule()) {
			courseSectionSchema.setCourseSectionMeetingSchedule(cs.getSectionScheduleCopy());
		}

		logger.debug("createCourseSectionObject method End");

		return mapper.writeValueAsString(courseSectionSchema);

	}

	/**
	 * This is the main method for this class and this will calls the sub
	 * methods for the JSON format conversion.
	 */
	public List<String> formatData() {
		logger.debug("Entering formatData method");

		DOMConfigurator.configure("log4j-config.xml");
		List<String> jsonList = getJSONListfromCSV();
		List<String> kafkaMessages = csvJsonToKafkaMessages(jsonList);
		
		logger.debug("Exiting formatData method");
		
		return kafkaMessages;
	}

}
