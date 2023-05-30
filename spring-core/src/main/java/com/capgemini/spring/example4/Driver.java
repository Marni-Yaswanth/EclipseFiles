package com.capgemini.spring.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("example.xml");
		Student student1 = (Student) context.getBean("student4");
		student1.displayMarks();
	}

}
