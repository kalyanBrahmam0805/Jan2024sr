package com.kodnest.Selectionsort;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] arr=new int [a];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the elements before swapping");
		for(int x:arr)
		{
			System.out.println(x);
		}
	selectionsortapp.selectionsort(arr);
     System.out.print("Elements after swapping");
	for(int x:arr) {
		System.out.println(x);
		
	}
	}
	

	
}