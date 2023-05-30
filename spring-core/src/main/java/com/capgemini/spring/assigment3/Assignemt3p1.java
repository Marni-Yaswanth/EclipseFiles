package com.capgemini.spring.assigment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignemt3p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("assignment3p1.xml");
		Location location = (Location) context.getBean("location");
		location.displayinfo();
	}

}
