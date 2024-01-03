package com.sortingtechniques;

public class SortingTechniquesApp {
	//private static final int[] arr = null;
	//Insertion sort
void insertionsort(int arr[])
{
	for(int i=1;i<=arr.length-1;i++)
	{
		int item=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>item)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=item;
		
	}
	
}
//selection sort
 void selectionsort(int []arr) {
	int min;
	int pos;
	int help;
	for(int i=0;i<=arr.length-2;i++)
   {
		min=arr[i]; 
		pos=i;
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(arr[j]<min)
			{
				min=arr[j];
				pos=j;
			}
		}
	
		help=arr[i];
		arr[i]=arr[pos];
		arr[pos]=help;
		
}
	
}
 //Bubble sort
 public void bubblesort(int []arr){ 
	 int help;
	 for(int i=0;i<arr.length-1;i++)
	 {
		 for(int j=0;j<arr.length-1-i;j++)
		 {
			if(arr[j]>arr[j+1])
			{
				help=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=help;
			}
		 }
	 }
 }
 //Binary search
 public static int BinarySearch(int []arr,int key) {
 int low=0;
 int high=arr.length-1;
 while(low<=high)
 {
	int mid=(low+high)/2;
	if(key==arr[mid])
	{
		//System.out.println("key found");
	     return 0; 
	}
	else if(key>arr[mid])
	{
		low=mid+1;
	}
	else {	
     high=mid-1;
     
}
	//System.out.println("key not found");
	
}
 return -1;
 }
 //linear search
 public static int linearsearch(int arr[],int targett)
 {
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 if(arr[i]==targett)
		 {
			 return targett;
		 }
	 }
	 return 0; 
	 
	 
	 
 
 	
 }


}
