package com.capgemini.spring.DegreedAssignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("question2.xml");
		
		Class class4 = (Class)context.getBean("list");
		for(String class5 : class4.getLst())
		{
			System.out.println(class5);
		}
		
		Class class2 = (Class)context.getBean("set");
		for(String class3 : class2.getSet())
		{
			System.out.println(class3);
		}
		
		Class class1 = (Class)context.getBean("map");
		for (int i=0;i<class1.getMap().size();i++)
		{
			System.out.println(class1.getMap().get(i));
		}
		
		///change map to set / list to get the elements of list or set
		
		
		
		
		
	}

}
