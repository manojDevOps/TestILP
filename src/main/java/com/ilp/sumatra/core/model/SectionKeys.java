package com.ilp.sumatra.core.model;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author 518943
 *
 */
public class SectionKeys {

	private String active;

	private String createdDate;

	private String key;

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}