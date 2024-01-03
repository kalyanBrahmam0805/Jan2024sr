package com.kodnest.WithDaemon;

public class VideoCheck  extends Thread{
	public void run()  {
		try {
			for( ; ;)
			{
				System.out.println("Video Check Is Happeing");
				Thread.sleep(3000);
			}
		}


		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
