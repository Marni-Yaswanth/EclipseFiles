package com.capgemini.spring.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingsDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Welcome welcome = (Welcome) context.getBean("welcome");
		System.out.println(welcome.getMessage());	
	}

}
