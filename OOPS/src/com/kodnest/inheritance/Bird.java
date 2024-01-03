package com.kodnest.inheritance;

public class Bird {
	String name;
	String colour;
	public void eat() {
		System.out.println("Bird is eating");
	}
	public void fly() {
		System.out.println("Bird is flying");
	}

	
}
class eagle extends Bird {
	public void hunt()
	{
		System.out.println("Eagle is Hunting");
	}
	
}
class sparrow extends Bird{
	public void buildnest() {
		System.out.println();
	}
	
}
