package comparator;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class ListComparing  {
	
	
	
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = scanner.next();
		
		String paString = "^[a-zA-z][a-zA-z0-9_]+";
		
		boolean flag = Pattern.matches(paString, string);
		
	
		
		if(string.length()<8 && string.length()>30)
		{
			System.out.println("invalid username length");
			return;
		}
		else {
			if(flag)
			{
				System.out.println("matches");
			}
			else {
				System.out.println("not matching");
			}
		}
			
		
		} 
		
		
		
		
		
		
}
	
	

