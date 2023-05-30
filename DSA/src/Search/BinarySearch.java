package Search;



public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int li=0;
		int hi=arr.length;
		int mi=(li+hi)/2;
		System.out.println(mi);
		int item =12 ;
		
		while(li<=hi)
		{
			
			if (arr[mi]==item)
			{
				System.out.println("fount at : "+mi);
				break;
			}
			else if(arr[mi]<item)
			{
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
	}
}
