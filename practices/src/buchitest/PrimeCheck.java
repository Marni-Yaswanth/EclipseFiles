package buchitest;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int num = scanner.nextInt();
		int temp=num;
		int sum=0;
		int rem=0;
		
		String string = String.valueOf(num);
		int length = string.length();
		//System.out.println(length);
		while(num>0)
		{
			rem = num%10;
			System.out.println(rem);
			sum = (int) (sum + (Math.pow(rem, length)));
			System.out.println(sum);
			num=num/10;
			System.out.println(num);
			System.out.println("--------------------");
		}
		
		if(sum==temp)
		{
			System.out.println("armstrong");
		}
		else {
			System.out.println("not an armstrong");
		}
	}
	

}
