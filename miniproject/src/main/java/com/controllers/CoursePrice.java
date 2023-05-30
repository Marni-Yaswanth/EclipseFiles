package com.controllers;

import java.util.HashMap;
import java.util.Map;


public class CoursePrice {

	static Map<String,Double> priceList = new HashMap<String,Double>();
	static {
		priceList.put("CSE", (double) 56000);
		priceList.put("Mechanical", (double) 59000);
		priceList.put("Electronics", (double) 66000);
		priceList.put("Civil", (double) 46000);
	}
	public double showPrice(String course) throws CourseNotFoundException
	{
		double price=0;
		if(priceList.containsKey(course))
		{
			for(String string : priceList.keySet())
			{
				
				if(string.equalsIgnoreCase(course))
				{
					price = priceList.get(string);
					
				}
				
			}
		}
		else {
			throw new CourseNotFoundException("No such course Found");
		}
		
		
		
		//System.out.println(price);
		return price;
	}
	
}
