package com.kodnest.raceroundcondsol;

public class Interview extends Thread {
	 synchronized public void run()
	{
		try {
			String name=Thread.currentThread().getName();
			for(int i=1;i<=5;i++)
			{
				System.out.println(name+"Is Attending Interview");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
