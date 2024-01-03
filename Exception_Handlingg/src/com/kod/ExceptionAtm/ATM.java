package com.kod.ExceptionAtm;

import java.util.Scanner;

public class ATM {
	public void takemoney()throws Exception
	{
		try {
			System.out.println("Transcation is started");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the pin of your Account");
			int pin=sc.nextInt();
			System.out.println("Collect your Money");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally
		{
			System.out.println("Transcation is completed");
		}

	}





}
