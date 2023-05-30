package org.capgemini.spring.example3;

public class Student {
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
	
//	public Student(String name, int rollNo, long phoneNo) {
//		super();
//		this.name = name;
//		this.rollNo = rollNo;
//		this.phoneNo = phoneNo;
//	}
	
}
