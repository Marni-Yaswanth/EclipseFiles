package com.capgemini.spring.miniProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("miniProject.xml");
		Student student = (Student) context.getBean("studentBean");
		student.displayStudentDetails();
	}

}
