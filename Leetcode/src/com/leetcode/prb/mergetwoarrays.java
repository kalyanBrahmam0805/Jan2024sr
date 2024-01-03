package com.leetcode.prb;
//
import java.util.Scanner;
//
public class mergetwoarrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr1[]=new int[a];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=sc.nextInt();
		}

		int arr2[]=new int[5];
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=sc.nextInt();
		}

		int resulantarr[]=new int [10];

		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
			resulantarr[i]=arr1[i]+arr2[i];
			}
		}


	}
}








