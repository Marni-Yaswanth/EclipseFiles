package com.in28minutes.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes("name")
public class LoginController {
	@Autowired
	UserValidation userValidation;
	
	@RequestMapping(value="/login" , method = RequestMethod.GET)
	
	public String sayHello()
	{
		return "login";
	}
	@RequestMapping(value="/login" , method = RequestMethod.POST)
	
	public String sayHello1(@RequestParam String name,@RequestParam String pass , ModelMap model)
	{
	if (userValidation.isValid(name, pass))
	{
		model.addAttribute("name", name);
		model.addAttribute("pass",pass);
		return "welcome";
	}
	else {
		model.addAttribute("error","invalid credentials");
		return "login";
	}
		
	}
}
 