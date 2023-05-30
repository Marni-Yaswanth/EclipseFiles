package com.capgemini.spring.assignment4p1;

public class Student {

	int StudentCode;
	String StudentName;
	Address stuAdd;
	public int getStudentCode() {
		return StudentCode;
	}
	public void setStudentCode(int studentCode) {
		StudentCode = studentCode;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Address getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(Address stuAdd) {
		this.stuAdd = stuAdd;
	}
	public void display()
	{
		System.out.println(StudentCode);
		System.out.println(StudentName);
		System.out.println(stuAdd);
	}
	
}
