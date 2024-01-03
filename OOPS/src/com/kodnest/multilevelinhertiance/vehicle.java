package com.kodnest.multilevelinhertiance;
 class vehicle1 {
	int regno;
public void move()
{
	System.out.println("Car is moving");
}
}
class car extends vehicle1
{
	
}
class sedan extends vehicle1{
	
}
class vehicle{
	public static void main(String[] args) {
		sedan s= new sedan();
		s.regno=9999;
		s.move();
		System.out.println(s.regno);
		
		car c =new car();
		c.regno=1234;
		c.move();
		System.out.println(c.regno);
	}
}
