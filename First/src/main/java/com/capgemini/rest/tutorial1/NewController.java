package com.capgemini.rest.tutorial1;


import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	
	public ArrayList<Student> students()
	{
		ArrayList<Student> list = new ArrayList<Student>();
		Student student1 = new Student();
		student1.setName("yashu");
		
		Student student2 = new Student();
		student2.setName("marni");
		
		Student student3 = new Student();
		student3.setName("hello");
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		return list;
	}
	
	@RequestMapping(value="/{name}", method = RequestMethod.GET )
	public Student get(@PathVariable("name") String studentname) {
		
		Student student = new Student();
		student.setName(studentname);
		student.setCity("mumbai");
		return student;
	}
	@
	RequestMapping(value="/{name}", method = RequestMethod.PUT)
	public boolean update(@PathVariable("name") String studentname, @RequestBody Student student)
	{
		System.out.println(studentname);
		student.setName(studentname);
		System.out.println("student name : "+student.getName()+"student city: "+student.getCity());
		
		return true;
	}
	
}
