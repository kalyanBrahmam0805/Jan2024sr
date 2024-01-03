package com.kod.checkedexp;

public class prg1 {
	void activity()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("I am Learning java");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
