package com.ilp.sumatra.core.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Brand {

	private String name;

	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/*
	 * @Override public String toString() { return "ClassPojo [name = "+name+
	 * ", url = "+url+"]"; }
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);

	}
}
