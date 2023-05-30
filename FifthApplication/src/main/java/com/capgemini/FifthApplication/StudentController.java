package com.capgemini.FifthApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView login()
	{
		ModelAndView modelAndView = new ModelAndView("login");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/welcome",method = RequestMethod.POST)
	public ModelAndView welcome(@ModelAttribute("student")Student student)
	{
		ModelAndView modelAndView = new ModelAndView("welcome");
		
		
		modelAndView.addObject(student);
		return modelAndView;
		
	}
}
