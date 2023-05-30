package com.Amit.BankAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example {
	static Map<String,Double> priceList = new HashMap<String,Double>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		

			
				priceList.put("CSE", (double) 56000);
				priceList.put("Mechanical", (double) 59000);
				priceList.put("Electronics", (double) 66000);
				priceList.put("Civil", (double) 46000);
			
		System.out.println(showPrice("cse"));
			
		}
	public static double showPrice(String course) 
	{
		double price=0;
		for(String string : priceList.keySet())
		{
			if(string.equalsIgnoreCase(course))
			{
				price = priceList.get(string);
				break;
			}
			
		}
		//System.out.println(price);
		return price;
	}
	}


