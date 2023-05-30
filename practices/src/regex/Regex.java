package regex;

import java.util.Scanner;
import java.util.regex.*;

class Regex{
	
    public static void main(String[] args){
    	
    Scanner scanner = new Scanner(System.in);
    
    String in = scanner.next();
    String reg = "[0-9]{0,4}[0-9]{0,4}[0-9]{0,4}[\\.]"
    		+ "[0-9]{0,4}[0-9]{0,4}[0-9]{0,4}[\\.]"
    		+ "[0-9]{0,4}[0-9]{0,4}[0-9]{0,4}[\\.]"
    		+ "[0-9]{0,4}[0-9]{0,4}[0-9]{0,4}";
   
    boolean b = Pattern.matches(reg, in);
    
    if(b==true)
    {
        System.out.println(true);
    }
    else
    {
        System.out.println(false);
    }
}}