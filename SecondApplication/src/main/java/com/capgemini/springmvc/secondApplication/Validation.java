package com.capgemini.springmvc.secondApplication;

public class Validation {

	public boolean isValid(String nameString, String passString) {
		if(nameString.equals("yaswanth") && passString.equals("hii"))
			return true;
		return false;
	}
	
	
}
