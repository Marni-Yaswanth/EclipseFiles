package com.capgemini.rest.tutorial1;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"id"})
@JsonPropertyOrder({"id", "student_name", "city"})
public class Student {
	@JsonProperty("student_name")
	String name;
	String id;
	String city;
	
	
	ArrayList<String>  skills = new ArrayList<String>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Student(String name, String id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	

}
