package com.kodnest.WithDaemon;

public class SessionConductance extends Thread {
	public void run()
	{
		try {
          for(int i=1;i<=5;i++)
          {
        	  System.out.println("Session is Getting Conducted");
        	  Thread.sleep(3000);
          }
          
		}
	catch(Exception e)
	{
            e.printStackTrace();
	}

}

}
