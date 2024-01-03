package com.kodnest.MutliThreading;

import java.util.Scanner;

public class Addition extends Thread{ 
	public void run() {
	try 
	{
		System.out.println("Addition Started");
		System.out.println("Addiction Activity Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		int c=a+b;
		Thread.sleep(3000);
		System.out.println("Additon result is :"+c);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}

