package com.Bbubblesort.com;
import java.util.Scanner;
public class bubblesorttecn 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		int help=0;
		System.out.print("Enter the elements before swapping :");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]<arr[j+1]) {
					
				
				help=arr[j];

				arr[j]=arr[j+1];

				arr[j+1]=help;
				}

			}
		}
		System.out.println();

	System.out.print(" Elements  after swapping :");
	for(int i:arr) {
		
		System.out.print(i+" ");
		
	}
}
}




