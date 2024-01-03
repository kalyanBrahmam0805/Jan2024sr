package com.kod.EH;

import java.util.Scanner;

public class prg1 {

	void displ()
	{
		try {
			System.out.println("Disp1 Execution Started");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First Number");
			int  a=sc.nextInt();
			System.out.println("Enter second number");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			System.out.println("Disp1 Execution Ended");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}

	}

}

