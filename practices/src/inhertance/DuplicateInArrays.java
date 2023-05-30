package inhertance;

import java.security.PublicKey;

public class DuplicateInArrays {
	


	public  static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,4};
		
		int size=0;
		int arr1[] = new int[arr.length];
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]!=4)
			{
				
				arr1[size]=arr[i];
				size++;
			}
			
		}
		for (int j=0;j<arr1.length;j++)
		{
			System.out.println(arr1[j]);
		}
		
		
		
	}
	
	
	
	
}
