package com.ilp.sumatra.core;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ilp.sumatra.core.model.Metadata;
import com.ilp.sumatra.core.model.SectionKeys;

/**
 * @author 518943
 *
 */
public class CourseSection {

	static final Logger logger = Logger.getLogger(CourseSection.class);

	@JsonProperty
	private String[] sectionSchedule;
	@JsonProperty
	private String courseAvatar;
	@JsonProperty
    private String sectionTitle;
	@JsonProperty
    private String startDate;
	@JsonProperty
    private String endDate;
	@JsonProperty
    private String courseId;
	@JsonProperty
    private String openenrollmentbegins;
	@JsonProperty
    private String openenrollmentends;
	@JsonProperty
    private String sectionDescription;
	@JsonProperty
    private String updatedAt;
	@JsonProperty
    private String id;
	@JsonProperty
    private String[] productCodes;
	@JsonProperty
    private String createdAt;
	@JsonProperty
    private String sectionCode;
	@JsonProperty
    private SectionKeys[] sectionKeys;
	@JsonProperty
    private Metadata metadata;
	@JsonProperty
    private String sectionDetails;
	@JsonProperty
    private String sectionStatus;
	@JsonProperty
    private String sectionScheduleCopy;

	public String getSectionDetails() {
		return sectionDetails;
	}

	public void setSectionDetails(String sectionDetails) {
		this.sectionDetails = sectionDetails;
	}

	public String getCourseAvatar() {
		return courseAvatar;
	}

	public void setCourseAvatar(String courseAvatar) {
		this.courseAvatar = courseAvatar;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getSectionTitle() {
		return sectionTitle;
	}

	public void setSectionTitle(String sectionTitle) {
		this.sectionTitle = sectionTitle;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getOpenenrollmentbegins() {
		return openenrollmentbegins;
	}

	public void setOpenenrollmentbegins(String openenrollmentbegins) {
		this.openenrollmentbegins = openenrollmentbegins;
	}

	public String getOpenenrollmentends() {
		return openenrollmentends;
	}

	public void setOpenenrollmentends(String openenrollmentends) {
		this.openenrollmentends = openenrollmentends;
	}

	public String getSectionDescription() {
		return sectionDescription;
	}

	public void setSectionDescription(String sectionDescription) {
		this.sectionDescription = sectionDescription;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getSectionStatus() {
		return sectionStatus;
	}

	public void setSectionStatus(String sectionStatus) {
		this.sectionStatus = sectionStatus;
	}

	public String[] getProductCodes() {
		return productCodes;
	}

	public void setProductCodes(String[] productCodes) {
		this.productCodes = productCodes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getSectionCode() {
		return sectionCode;
	}

	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}

	public SectionKeys[] getSectionKeys() {
		return sectionKeys;
	}

	public void setSectionKeys(SectionKeys[] sectionKeys) {
		this.sectionKeys = sectionKeys;
	}

	public String[] getSectionSchedule() {
		/*
		 * String sectionValue = null; int len = sectionSchedule.length; for(int
		 * i=0;i<len;i++){ String sectionValue = sectionSchedule[i]; }
		 */
		return sectionSchedule;
	}

	public void setSectionSchedule(String[] sectionSchedule) {
		this.sectionSchedule = sectionSchedule;
		int length = this.sectionSchedule.length;
		String data = "[";
		for (int i = 0; i < length; i++) {
			if (i == (length - 1)) {
				data = data + sectionSchedule[i];
			}
			else if (i < length) {
				data = data + sectionSchedule[i] + ",";
			} 
		}
		data = data + "]";
		this.sectionScheduleCopy = data;

	}

	public String getSectionScheduleCopy() {
		return sectionScheduleCopy;
	}

	public void setSectionScheduleCopy(String sectionScheduleCopy) {
		this.sectionScheduleCopy = sectionScheduleCopy;
		/*
		 * int length = this.sectionSchedule.length; String data = ""; for(int
		 * i=0; i<length; i++) { data += sectionSchedule[i]; }
		 * this.sectionScheduleCopy = data;
		 */
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);

	}
}