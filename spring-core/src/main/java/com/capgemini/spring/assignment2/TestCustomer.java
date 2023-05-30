package com.capgemini.spring.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("assignment2.xml");
		Customer customer = (Customer) context.getBean("customer");
		customer.Show_customer();
	}

}
