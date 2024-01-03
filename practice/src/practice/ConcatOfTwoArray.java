package practice;

import java.util.Scanner;

public class ConcatOfTwoArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int a =sc.nextInt();
		int arr1[]=new int[a];
		System.out.println("Enter the Elements in the array");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int x:arr1)
		{
			System.out.println(x);
		}
		int arr2[]=new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[i]=arr1[i];
		}
		for(int x:arr2)
		{
			System.out.println(x);
		}

	}

}
