package org.capgemini.spring.Interfaces;

//import org.capgemini.spring.example3.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("xmlFile.xml");
		Interface i1 = (Interface) context.getBean("parent");
		i1.thingsTheyDo();
	}

}
