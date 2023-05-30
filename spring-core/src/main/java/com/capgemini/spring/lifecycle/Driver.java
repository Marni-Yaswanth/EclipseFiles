package com.capgemini.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("InitAndDestroy.xml");
	
	Student student = (Student) context.getBean("student");
	
	student.display();
	context.registerShutdownHook(); 
}
}
