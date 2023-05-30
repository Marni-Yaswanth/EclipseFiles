package com.capgemini.spring.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Annotation annotation = (Annotation) context.getBean("annotation");
		System.out.println(annotation.getExample().getPhNo());
		
		
		
		
	
}
}
