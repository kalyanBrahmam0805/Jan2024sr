package com.kodnest.SingleThreading;

import java.util.Scanner;

public class Program {
	 public static void main(String[] args) {
		 try {
		System.out.println("Addition Started");
		System.out.println("Addiction Activity Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Additon result is :"+c);
		System.out.println("Printing the Numbers Started");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		 }
		 catch(Exception e ) {
				 
		e.printStackTrace();
		 }
	}

}
