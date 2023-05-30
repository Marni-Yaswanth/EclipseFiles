package amit;

import java.rmi.Remote;
import java.util.Arrays;
import java.util.Scanner;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num=345;
		int count=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("its a prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
