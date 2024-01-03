package com.kodnest.Tightcoupledprg;

public class person {
	car c =new car();
	
	void travel()
	{
		System.out.println("Travelling");
		c.start();
		c.move();
		c.stop();
	}
	
}
