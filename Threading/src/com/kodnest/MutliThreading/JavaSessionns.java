package com.kodnest.MutliThreading;

public class JavaSessionns implements Runnable {
	public void run()
	{
		try {
			System.out.println("Students joined The session");
			for(int i=1;i<=2;i++)
			{
				System.out.println("Students is attending the session"+i);

				Thread.sleep(3000);
			} 
		} 
		catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("Students has left the session");
	}
}




