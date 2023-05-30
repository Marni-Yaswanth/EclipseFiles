package com.capgemini.student;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	@RequestMapping(value= "/",method = RequestMethod.GET)
	public List<Student> show()
	{
		return service.getAllUser();
	}
	@RequestMapping(value= "/{id}",method = RequestMethod.GET)
	public Student showP(@PathVariable("id")int id)
	{
		return service.showPStudent(id);
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void showPOst(@RequestBody Student student)
	{
		 service.add(student);
	}
	@RequestMapping(value="/modify/{id}",method=RequestMethod.PUT)
	public void modify(@RequestBody Student student,@PathVariable("id")int id)
	{
		 service.modify(id,student);
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void delete(@RequestBody Student student,@PathVariable("id")int id)
	{
		 service.delete(id);
	}
	
}
