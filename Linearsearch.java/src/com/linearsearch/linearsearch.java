package com.linearsearch;
import java.util.Scanner;
public class linearsearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] arr=new int [a];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		int low=0;
		int high=arr.length-1;
		int key=sc.nextInt();
		int mid = 0;
		while(low<=high) {
			mid=((low+high)/2);

			if(key==arr[mid])
			{
				System.out.println("key found");
				return ;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;

			}
		}
		System.out.println("key not found");
	}
}
