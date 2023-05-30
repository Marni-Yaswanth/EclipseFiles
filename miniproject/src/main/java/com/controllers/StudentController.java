package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.student.Student;

@Controller
public class StudentController {

	@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView showLogin()
	{
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
	
	@RequestMapping(value="/success" , method = RequestMethod.POST)
	public ModelAndView loginSuccess(@ModelAttribute("Student") Student student)
	{
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject(student);
		return modelAndView;
	}
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public ModelAndView modifyLogin()
	{
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
	@RequestMapping(value="/welcome page",method = RequestMethod.POST)
	public ModelAndView welcomePage()
	{
		ModelAndView modelAndView = new ModelAndView("welcome page");
		return modelAndView;
	}
	@RequestMapping(value="/price page",method=RequestMethod.POST)
	public ModelAndView showPrice(@RequestParam("courses")String course,@ModelAttribute("student")Student student,@ModelAttribute("coursePrice")CoursePrice coursePrice) throws CourseNotFoundException 
	{
		
		ModelAndView modelAndView = new ModelAndView("price page");
		modelAndView.addObject("course",course);
//		System.out.println(course);
		modelAndView.addObject("price",coursePrice.showPrice(course));
		
		return modelAndView;
	}
	
}
