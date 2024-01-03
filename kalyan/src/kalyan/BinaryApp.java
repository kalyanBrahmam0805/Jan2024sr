package kalyan;

public class BinaryApp {
	public static void  binary(int arr[],int key) {

		int low=0;
		int high =arr.length;
		int mid=(low+high)/2;
		while(low<high)
		{
			if(key==arr[mid])
			{
					System.out.println("key found...");
			}
			else if(key>arr[mid])
			{
				low=mid+1;
				
			}
			else
			{		        	 
				high=mid-1;
				
			}
		}
		
		
		System.out.println("key not found....");
	}
}
	


