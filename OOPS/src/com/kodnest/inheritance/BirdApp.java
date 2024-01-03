package com.kodnest.inheritance;

public class BirdApp {
	public static void main(String[] args) {
		eagle e=new eagle();
		e.name="Sparrow";
		e.colour="Green";
		e.eat();
		e.fly();
		e.hunt();
		System.out.println("=============");
		sparrow s =new sparrow();
		s.name="Eagle";
		s.colour="Black";
		s.eat();
		s.fly();
		s.buildnest();
		
	}

}
