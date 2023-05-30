package com.capgemini.springmvc.secondApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginServer {
	@RequestMapping(value = "/welcome")
	
	public String SayHello()
	{
		return "welcome";
	}
	@RequestMapping(value = "/afterValidation")
	
	public String after()
	{
		return "afterValidation";
	}
	
	

}
