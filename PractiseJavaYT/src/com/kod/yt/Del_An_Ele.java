package com.kod.yt;

import java.util.Scanner;

public class Del_An_Ele {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int a =sc.nextInt();
		System.out.println("Enter array elements");
		int []arr=new int[a];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int x:arr)
		{	
			System.out.println("The Array contents are:"+x);
		}
		int del=sc.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==del)
			{
				continue;
			}
			else
			{
				System.out.println(arr[i]+" ");
			}
		}
	}
}
