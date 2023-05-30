package com.capgemini.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitAndDestroy implements InitializingBean , DisposableBean {
	String name;
	int rollNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void init()
	{
		System.out.println("in init method");
		
	}
	
	public void destroy1() {
		System.out.println("in destroy method");
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in init method of interface initializing bean");
		
	}
	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in destroy method of interface disposable bean");
		
	}
	
	
	

}
