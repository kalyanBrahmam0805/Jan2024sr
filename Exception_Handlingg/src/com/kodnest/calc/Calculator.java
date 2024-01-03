package com.kodnest.calc;

import java.util.Scanner;

public class Calculator {
	
	public void add() throws Exception
	{
		try {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled is add method");
			e.printStackTrace();
		}
		
	}
	public void sub() throws Exception {
		try {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter First Number");
			int a=sc.nextInt();
			System.out.println("Enter the Second Number");
			int b=sc.nextInt();
			int c=a-b;
			System.out.println(c);
			}
			catch(Exception e)
			{
				System.out.println("Exception Handled in sub method");
				e.printStackTrace();
			}
	}
	public void mul()
	{
		try {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter First Number");
			int a=sc.nextInt();
			System.out.println("Enter the Second Number");
			int b=sc.nextInt();
			int c=a*b;
			System.out.println(c);
			}
			catch(Exception e)
			{
				System.out.println("Exception Handled is mul method");
			}
	}
	public void div() throws Exception {
	try {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled is div method");
			e.printStackTrace();
		}
	}
}
