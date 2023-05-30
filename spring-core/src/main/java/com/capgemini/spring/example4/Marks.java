package com.capgemini.spring.example4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Marks {

	Map<String, Double> marks = new HashMap<String, Double>();
	String arr[] = {"telugu","hindi","english","maths","science"};
	public Map<String, Double> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Double> marks) {
		this.marks = marks;
	}
	public void displayMarks()
	{
		//System.out.println(Name);
		for(int i=0;i<getMarks().size();i++)
		{
			System.out.println(getMarks().get(arr[i]));
		}
	}
	
}
