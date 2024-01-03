package com.tapacademy;
import java.util.Scanner;
public class arrayevensum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int x:arr)
		{
 		if(x%2==0)
				sum=sum+x;
		}
		System.out.println(sum);
	}
}
		
	
	
