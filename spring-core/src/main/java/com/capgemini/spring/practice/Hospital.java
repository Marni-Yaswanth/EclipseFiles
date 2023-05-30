package com.capgemini.spring.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.*;
@Component
public class Hospital {

	@Value("leelavathi")
	String hosName;
	
	@Value("hii")
	String address;
	
	public String getHosName() {
		return hosName;
	}
	public void setHosName(String hosName) {
		this.hosName = hosName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@PreDestroy
	public void initialize()
	{
		System.out.println("in init");
	}
	
	
	
}
