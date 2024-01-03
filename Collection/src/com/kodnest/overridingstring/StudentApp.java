package com.kodnest.overridingstring;

public class StudentApp {
	public static void main(String[] args) {
		try
		{
			int a=0;
			System.out.println("a="+a);
			int b=20/a;
			System.out.println("b="+b);
				
		}
		catch(Exception e)
		{
			System.out.println("Divide by Zero error");
		}
		finally
		{
			System.out.println("Inside the finally bkokv");
		}
		for(int i=99;i>=9;i=2*i/9)
		{
			
		}
	
}

}	

	

