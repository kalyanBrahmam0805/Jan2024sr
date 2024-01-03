package com.kodnest.WithoutDaemon;

public class VideoCheck extends Thread {
	public void run()  {
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println("Video Check Is Happeing");
			}
		}


		catch(Exception e)
		{
               e.printStackTrace();
		}

	}
}