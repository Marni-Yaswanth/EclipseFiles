package com.fourthapplication;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

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
	public String loginPage()
	{
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("Name","hello"+name);
//		modelAndView.addObject("city","you r from"+city);
		return "login";
	}

	@RequestMapping(value="/welcome",method = RequestMethod.POST)
	public ModelAndView loginPage1(@ModelAttribute("student")Student student)
	{
		ModelAndView modelAndView = new ModelAndView("welcome");
//	
		return modelAndView;
	}
	
	
}
