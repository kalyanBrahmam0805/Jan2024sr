package com.kod.ExceptionAtm;

public class Bank {
public void initiate()
{
	try {
	System.out.println("Connection is Established");
	ATM atm=new ATM();
	atm.takemoney();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println("Connection got Terminated");
	}
}

} 
