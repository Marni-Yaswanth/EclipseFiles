package com.presentation.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("presentation_example.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.display();
		
	}

}
