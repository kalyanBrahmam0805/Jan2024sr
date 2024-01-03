package com.kod.Threading;

public class Javasessions implements Runnable {
	 
		public void run()
		{
			try {
				System.out.println("Students joined The session");
				for(int i=1;i<=5;i++)
				{
					System.out.println("Students is attending the session");

					Thread.sleep(3000);
				} 
			} 
			catch (Exception e) {

				e.printStackTrace();
			}
			System.out.println("Students has left the session");
		}
	}






