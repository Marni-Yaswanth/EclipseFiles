package com.in28minutes.login;

import org.springframework.stereotype.Service;

@Service
public class UserValidation {

	public boolean isValid(String name, String passString)
	{
		if (name.equals("yaswanth") && passString.equals("hii"))
			return true;
		return false;
	}
}
