package com.student;

import org.springframework.beans.factory.annotation.Autowired;

import com.controllers.CourseNotFoundException;
import com.controllers.CoursePrice;
import com.parent.Parent;

public class Student {

	private int regNo;
	private String name;
	private String city;
	private long phNo;
	
	@Autowired
	private CoursePrice coursePrice;

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public CoursePrice getCourse() {
		return coursePrice;
	}

	public void setCourse(CoursePrice course) {
		this.coursePrice = course;
	}

	
	
	
}
