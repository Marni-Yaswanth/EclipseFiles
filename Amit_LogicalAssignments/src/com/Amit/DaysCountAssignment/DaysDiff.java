package com.Amit.DaysCountAssignment;

import java.security.Identity;
import java.util.Scanner;

public class DaysDiff {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//System.out.println("Enter a date1 in the format of dd-mm-yyyy");
	String Date1 = "24-09-2021";
	//System.out.println("Enter the date2 in the format of dd-mm-yyyy");
	String Date2 = "21-03-2023";
	String[] date1arr = Date1.split("-");
	String[] date2arr = Date2.split("-");
	int yeardiff=0;
	int monthdiff=0;
	int datediff=0;
	int leap =0 ;
	
	int date1 = Integer.parseInt(date1arr[0]);
	int date2 = Integer.parseInt(date2arr[0]);
	int month1 = Integer.parseInt(date1arr[1]);
	int month2 = Integer.parseInt(date2arr[1]);
	int year1 = Integer.parseInt(date1arr[2]);
	int year2 = Integer.parseInt(date2arr[2]);
	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	
	if ((date1==date2)||(month1==month2))
	{
		datediff = (year1-year2)*365;
	}
	
	else if(month1!=month2)
	{
		if (year1!=year2)
		{
			for (int i=year1;i<=year2;i++)
			{
				for(int j=month1;j<=12;j++)
				{
					if(i== year2 && j==month2)
					{
						break;
					}
					else
					{
						
						datediff += days[j-1];
						System.out.println("year is"+i+" and month is "+j+"date diff is :"+datediff);
						monthdiff++;
						month1=1;
						
					}
				}
				if(i%4==0)
				{
					leap++;
				}
				
			}
			
			System.out.println(datediff);
			if (date1>date2)
			{
				System.out.println("datediff is "+(datediff+(date1-date2+leap)));
			}
			else  {
				System.out.println("datediff is "+(datediff+(date2-date1+leap)));
			}
		}
	}
	
	
	
	
}
}
