package com.kodnest.MutliThreading;

public class Printing extends Thread {
	public void run()
	{
		try {
			System.out.println("Printing Number Stared");
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(3000);
			}
		}
			catch (InterruptedException e) {

				e.printStackTrace();
			}
		
	}

}
