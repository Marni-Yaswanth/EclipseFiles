package org.capgemini.DegreedAssignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getCustomerContact());
		System.out.println(customer.getAdd().getStreet());
		System.out.println(customer.getAdd().getCity());
		System.out.println(customer.getAdd().getZip());
		System.out.println(customer.getAdd().getCountry());
		
	}

}
