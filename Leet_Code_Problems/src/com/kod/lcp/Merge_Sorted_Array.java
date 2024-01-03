package com.kod.lcp;

import java.util.Scanner;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The size of First array");
		int a=sc.nextInt();
		System.out.println("Enter the elements in an 1 array");
		int []arr1=new int[a];

		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}

		int []arr2=new int[a];
		System.out.println("Enter elements of 2nd array");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}

		int []res=new int[a+a];
		int index=0;

		System.out.println(res.length+"length");
		for(int i=0;i<arr1.length;i++)
		{
			res[index]=arr1[i];
			index++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			res[index]=arr2[i];
			index++;
		}

		for(int x:res)
			System.out.print(x+" ");
		for(int i=0;i<res.length;i++)	
		{
			for(int j=0;j<res.length-1;j++)
			{
				if(res[i]<res[j])
				{
					int temp=res[i];
					res[i]=res[j];
					res[j]=temp;
				}
			}

		}
		System.out.println();
		for (int i : res) {
			System.out.print(i+" ");
		}


	}

}
