package com.capgemini.spring.example4;

import java.util.HashMap;
import java.util.Map;

public class Student {
	
	String Name;
	long phNo;
	String address;
	//Map<String,Double> marks = new HashMap<String,Double>();
	Marks marks1;
	String arr[] = {"telugu","hindi","english","maths","science"};
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Marks getMarks1() {
		return marks1;
	}

	public void setMarks1(Marks marks1) {
		this.marks1 = marks1;
	}

	public void displayMarks()
	{
		System.out.println("Marks of : "+Name);
		for(int i=0;i< marks1.getMarks().size();i++)
		{
			System.out.println("Marks for the subject : "+arr[i]+" "+marks1.getMarks().get(arr[i]));
		}
	}
	
	
	
	
	
 	
	
	
	
}
