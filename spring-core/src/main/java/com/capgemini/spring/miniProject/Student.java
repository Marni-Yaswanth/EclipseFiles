package com.capgemini.spring.miniProject;

import java.util.Scanner;



//import org.capgemini.spring.Interfaces.Parent;

import com.capgemini.spring.example4.Marks;

public class Student {
	String name;
	int rollNo;
	Parent parent;
	StudentMarks studentMarks;
	

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




	public Parent getParent() {
		return parent;
	}




	public void setParent(Parent parent) {
		this.parent = parent;
	}




	public StudentMarks getStudentMarks() {
		return studentMarks;
	}




	public void setStudentMarks(StudentMarks studentMarks) {
		this.studentMarks = studentMarks;
	}




	public void displayStudentDetails()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Name : "+ getName());
		System.out.println("rollNo : "+ getRollNo());
		System.out.println("parents phNo : "+ getParent().getPhNo());
		System.out.println("Address : "+ getParent().getAddress());
		System.out.println("Parent officeName: "+ getParent().getOffice().getOfficeName());
		System.out.println("Parent Office Address: "+ getParent().getOffice().getOfficeAddress());
		System.out.println("Enter the subject marks:");
		String sub = sc.next();
		if(studentMarks.getStudentMap().containsKey(sub)==false)
		{
			System.out.println("subject not found...try again.  :) ");
			return;
		}
		
		System.out.println("Marks for the entered subject are : "+ studentMarks.getStudentMap().get(sub));
		
	}

	
	
	
	
}
