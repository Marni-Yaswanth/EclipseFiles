package BubbleSort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,7,3,4,5,8,5,6,2,7,1};
		int li=0;
		int hi = arr.length;
		
		int pi=(li=hi)/2;
		while(li<=hi)
		{
			while(arr[li]<pi)
			{
				li++;
			}
			while(arr[hi]>pi)
			{
				hi--;
			}
			if(li<=hi)
			{
				int temp = arr[li];
				arr[li] = arr[hi];
				arr[hi] = arr[li];
				li++;
				hi++;
			}
		}
		for (int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
			
	}

}
