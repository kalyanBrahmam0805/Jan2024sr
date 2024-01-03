package com.kodnest.raceroundcond;

public class Interview extends Thread {
	public void run()
	{
		String name=Thread.currentThread().getName();
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+"is attending interview");
			ry {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
