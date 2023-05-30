package com.capgemini.spring.assignment3part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowfilmInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("assignment3p2.xml");
		FilmDirectors filmDirectors = (FilmDirectors) context.getBean("map");
		filmDirectors.printFilmInfo();
	}

}
