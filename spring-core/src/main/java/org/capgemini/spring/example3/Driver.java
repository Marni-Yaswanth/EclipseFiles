package org.capgemini.spring.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Driver {
	public static Student loadStudent()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("xmlFile.xml");
		Student student = (Student) context.getBean("student");
		return student;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = loadStudent();
		System.out.println(student.getName());
		System.out.println(student.getRollNo());
		System.out.println(student.getPhoneNo());
	}

}
