package com.leetcode.arrayproblems;

import java.util.Scanner;

public class arrayprblm1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
     	int a=sc.nextInt();
		int []arr=new int[a];
		System.out.println("enter target value");
		int target=sc.nextInt();                
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		for(int x:arr) {
			System.out.println("The array elements are:"+x);	
		}
		
		    for(int i=0;i<=arr.length-1;i++){
		    	
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]+arr[j]==target) {
					System.out.println(i+" "+j);				
				}
			}
			
		}
		
		
		
	}

}
