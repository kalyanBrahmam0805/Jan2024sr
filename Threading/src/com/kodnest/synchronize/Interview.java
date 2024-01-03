package com.kodnest.synchronize;

public class Interview extends Thread {
	String book1="Java";
	String book2="Testing";
	String book3="sql";
	public void run()
	{
		if(getName().equals("Mustaffa"))
		{
			kalyanthread();
		}
		else
		{
			BrahmamThread();
		}

	}

	void kalyanthread()
	{

		try {

			synchronized(book1)
			{
				System.out.println("kalyan is learning " + book1);
				Thread.sleep(3000);

				synchronized(book2)
				{
					System.out.println("kalyan is learning " + book2);
					Thread.sleep(3000);

					synchronized(book3)
					{
						System.out.println("Kalyan is learning " + book3);


					}
				}
			}
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}


	}
	void BrahmamThread()
	{
		try
		{
			synchronized(book1)
			{
				System.out.println("Brahmam is Studying " + book1);
				Thread.sleep(3000);

				synchronized(book2)
				{
					System.out.println("Brahmam is studying " + book2);

					synchronized(book3)
					{
						System.out.println("Brahmam is studying " + book3);
					}
				}
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
