package com.kodnest.WithDaemon;

public class AudioCheck extends Thread {
	public void run()
	{
		try {
			
			for( ; ;)
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
