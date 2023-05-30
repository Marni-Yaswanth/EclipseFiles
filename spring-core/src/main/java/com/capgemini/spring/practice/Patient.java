package com.capgemini.spring.practice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class Patient {
	String name;
	String regNo;
	
	@Autowired
	Hospital hospital;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
	public void name() {
		System.out.println(hospital.getAddress());
	}
	public void init()
	{
		System.out.println("in init");
	}
	public void destroy()
	{
		System.out.println("in destroy");
	}
	
}
