package com.capgemini.spring.assignment4p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisplayEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("assignment4p2.xml");
		Emp emp = (Emp) context.getBean("emp");
		System.out.println(emp);
		
	}

}
