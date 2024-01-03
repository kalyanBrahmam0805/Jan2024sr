package com.kodnest.MutliThreading;

import java.util.Scanner;

public class Programm  extends Thread{ 
	public void run()
	{
		if(getName().equals("add"))
		{
			add();
		}
		else
		{
			printing();
		}
	}
	
	public void add()
	{
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First Number");
			int a=sc.nextInt();
			System.out.println("Enter Second Number");
			int b=sc.nextInt();
			int c=a+b;
			Thread.sleep(3000);
			System.out.println(c);
			
		}
		catch(Exception e)
		{
			System.out.println("Error Handled Successfully");
		}
	}
	public void printing()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Handled Successfully");
		}
	}
	

}
