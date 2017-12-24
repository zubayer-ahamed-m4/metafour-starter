package com.metafour.starter.model;

import org.springframework.stereotype.Service;

public class Degree {

	private String code;
	private String description;

	public Degree(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
