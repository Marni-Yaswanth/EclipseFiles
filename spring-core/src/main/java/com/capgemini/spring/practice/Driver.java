package com.capgemini.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("practice.xml");
		context.registerShutdownHook();
		Hospital hospital = (Hospital) context.getBean("hospital");
		hospital.getHosName();
	}

}
