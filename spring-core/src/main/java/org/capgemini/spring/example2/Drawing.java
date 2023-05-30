package org.capgemini.spring.example2;

import org.capgemini.spring.Circle;
import org.capgemini.spring.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Ex1XmlFile.xml");
		Ex1 Obj = (Ex1)context.getBean("points");
		Obj.draw();
		

	}

}
