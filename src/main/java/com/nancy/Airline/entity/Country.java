package com.nancy.Airline.entity;

public class Country {
	private String id;
	private String name;
	private String code;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Country(String id, String name, String code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
	}
	public Country() {
		
	}
	
	
	
}
