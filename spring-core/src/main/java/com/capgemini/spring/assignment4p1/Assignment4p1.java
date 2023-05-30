package com.capgemini.spring.assignment4p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment4p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("assignment4p1.xml");
		Student student = (Student) context.getBean("student");
		student.display();
	}

}
