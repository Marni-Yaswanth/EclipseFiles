package com.capgemini.spring.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Example {
	@Value("hii")
	String name;
	@Value("3")
	int num;
	
	@Value("789063539")
	long phNo;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}public Example() {
		
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
}
