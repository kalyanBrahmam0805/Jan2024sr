package com.kodnest.binarysearch;

public class Binaraysearchapp {
	void  binary(int arr[],int key) {

		int low=0;
		int high =arr.length-1;
		while(low<=high)
		{                                     
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
					System.out.println("key found at index " + mid);
					return ;
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
	
