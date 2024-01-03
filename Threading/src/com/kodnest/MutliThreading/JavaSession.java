package com.kodnest.MutliThreading;

public class JavaSession implements Runnable{
	public void run() {
		String name=Thread.currentThread().getName();
		try {
			for(int i=1;i<=5;i++)
				{
				System.out.println(name + "Watching java session");
				Thread.sleep(3000);
				}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
