package com.ilp.sumatra.core.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Metadata {
	private String copyable;

	private String launchUrl;

	private String externalPairing;

	private Brand brand;

	public String getCopyable() {
		return copyable;
	}

	public void setCopyable(String copyable) {
		this.copyable = copyable;
	}

	public String getLaunchUrl() {
		return launchUrl;
	}

	public void setLaunchUrl(String launchUrl) {
		this.launchUrl = launchUrl;
	}

	public String getExternalPairing() {
		return externalPairing;
	}

	public void setExternalPairing(String externalPairing) {
		this.externalPairing = externalPairing;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		// return "ClassPojo [copyable = "+copyable+", launchUrl =
		// "+launchUrl+", externalPairing = "+externalPairing+", brand =
		// "+brand+"]";
		return ToStringBuilder.reflectionToString(this);
	}

}
