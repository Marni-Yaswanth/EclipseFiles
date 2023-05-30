package org.capgemini.spring.Interfaces;

public class Parent implements Interface {
	String name;
	long phNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public void thingsTheyDo() {
		// TODO Auto-generated method stub
		System.out.println("i am "+ name +" and i can do all my work after this work.");
	}
	
}
