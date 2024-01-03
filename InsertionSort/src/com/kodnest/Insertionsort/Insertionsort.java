package com.kodnest.Insertionsort;
import java.util.Scanner;
public class Insertionsort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size length");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter the array elements ");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements are before swapping :");
		for(int x:arr) 
		{
			System.out.print(x+" ");

		}
		Insertionsort i=new Insertionsort();
       	i.insertion(arr);
		//Insertionsort.insertion(arr);
	}

	public static void insertion(int arr[])
	{
		for(int i=1;i<=arr.length-1;i++)
		{
			int  item=arr[i];
			int j=i-1;
			while( j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;

		}
		System.out.println(" ");
System.out.println("Elements after swapping");
		for(int x:arr) 
		{
			System.out.print(x+" ");
		}
	}

}
