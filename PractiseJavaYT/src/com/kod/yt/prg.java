package com.kod.yt;

import java.util.Scanner;

public class prg {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
	 for(int i=0;i<=arr.length-1;i++)
	 {
		  sum=sum+arr[i];
	 }
	 
		int totalsum= n*(n + 1)/2;
		int missingnum=totalsum-sum;
		System.out.println("missing number" + missingnum);
		
		
		
		
	}

}
