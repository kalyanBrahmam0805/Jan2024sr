package com.sortingtechniques;
import java.util.Scanner;
public class sortingTechniques {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		//int n = sc.nextInt();
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements :");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt(); 
		
		}
		
		System.out.print("The array elements are before sorting:"+" ");
		for(int x: arr)
		{
			System.out.println(x);
		}
 
	//Sorting for Insertion Sort
	SortingTechniquesApp s=new SortingTechniquesApp();
	
	//Sorting for selection sort
	
//	s.selectionsort(arr);
//	System.out.println("The selection sort after sorting elements are :");
//	for(int x:arr) 
//	{
//		System.out.println(x);
//		
//	}
	//sorting for bubble sort
 
	//Binary search
	
	//selection sort
//	System.out.println("The selection sort after sorting elements are :");
//	for(int x:arr) 
//	{
//		System.out.println(x);
//		
//	} 
	//Linearsearch
//	System.out.println("Enter target number to be found");
//	int targett=sc.nextInt();
//	int res2=s.linearsearch(arr,targett);
//	
//    if(res2==targett)
//    {
//    	System.out.println("Target found");
//    }
//    else
//    {
//    	System.out.println("Target not found");
//    }
    
    System.out.println("Enter the case to sort the array");
    
    int search = sc.nextInt();
   
    switch (search) {
	case 1: 
		s.insertionsort(arr);
		System.out.println("The array elements are after sorting:"+" ");
		for(int x: arr)
		{
			System.out.println(x);
		}
		break;
		case 2:
			s.bubblesort(arr);
			System.out.println("The bubble sort after sorting elements are :");
			for(int x:arr) 
			{
				System.out.println(x); 
			}
			break; 
		case 3:
			System.out.println("Enter the key value :");
			int key=sc.nextInt();
			int res=s.BinarySearch(arr,key);
			if (res==0)
			{
				System.out.println("key found");
			}
			else {
				System.out.println("key not found");
			}
			break;
		case 4:
			s.selectionsort(arr);
			System.out.println("The selection sort after sorting elements are :");
			for(int x:arr) 
			{
				System.out.println(x);
				  
			}
			break; 
		 
	
    case 5:
		System.out.println("Enter target number to be found");
		int targett=sc.nextInt();
		int res2=s.linearsearch(arr,targett);
		
	    if(res2==targett)
	    {
	    	System.out.println("Target found");
	    }
	    else
	    {
	    	System.out.println("Target not found");
	    }
	    
	    //System.out.println("Enter the code to sort the array");
	    
	}
    		
	
	
}
	
}
