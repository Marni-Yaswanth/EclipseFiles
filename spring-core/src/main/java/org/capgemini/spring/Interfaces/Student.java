package org.capgemini.spring.Interfaces;

public class Student implements Interface {

	String name;
	int rollNo;
	long phoneNo;
	
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
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void thingsTheyDo() {
		// TODO Auto-generated method stub
		System.out.println("i m studying and i can do my work after studies.");
	}
	}
