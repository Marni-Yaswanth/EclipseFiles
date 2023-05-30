package com.capgemini.spring.assignment2_part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("assignment2_part2.xml");
		Book book = (Book) context.getBean("book");
		book.display();
		
	}

}
