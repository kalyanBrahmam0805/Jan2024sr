package com.leetcode.arrayproblems;

import java.util.Scanner;

public class flipping_in_an_Image {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int []arr=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
			
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			//System.out.print(arr[i]+" ");
			if (arr[i]==0)
			{
				System.out.println(arr[i]=1);
			}
		}
		
	}

}
