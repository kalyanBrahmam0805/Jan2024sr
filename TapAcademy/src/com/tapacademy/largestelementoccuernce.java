package com.tapacademy;
import java.util.Scanner;
public class largestelementoccuernce {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size length");
		int a=sc.nextInt();
		int []arr=new int[a];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int x:arr)
		{
			System.out.println("The array elements are"+ " ");

			int largestoccuernce=0;       //47 63  63 10 45 78

			int count=0;
			while(x>largestoccuernce)
			{
				largestoccuernce=x;

			}
		
			 if(x==largestoccuernce)
			{
				count++;
				System.out.println(count);
			}
		}
		}
	}
