package com.kodnest.Producerconsumerprb;

public class PizzaHouse {
	int pizzanum;
	boolean status=false;
	synchronized public void bake(int x)
	{
		try {
			if(status==true)
			{
				wait();
			}
			else {
				pizzanum=x;
				System.out.println("Baker Has Baked Pizza"+pizzanum);
				status=true;
				notify();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	synchronized public void eat()
	{
		try {
			if(status==true)
			{
				System.out.println("Eater Has Consumed pizza"+pizzanum);
				status=false;
				notify();
			}
			else
			{
				wait();
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
