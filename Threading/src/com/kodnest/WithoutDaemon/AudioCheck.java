package com.kodnest.WithoutDaemon;

public class AudioCheck extends Thread {
	public void run()
	{
		try {
			for(int i=1;i<5;i++)
			{
				System.out.println("Audio Check is Happening");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
