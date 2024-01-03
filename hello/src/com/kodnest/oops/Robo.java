package com.kodnest.oops;

public class Robo {
	String name;
	String type;

	public void talk()
	{
		System.out.println("robo is talking");
	}
	public void walk()
	{
		System.out.println("robo is walking");
	}
	public void charge()
	{
		System.out.println("robo is charging");
	}
}
 class TeacherRobo extends Robo{
	public void teach()
	{
		System.out.println("robo is tteaching");
	}
}
class ChefRobo extends Robo{
	public void cook() {
		System.out.println(" robo is cooking");
	}
}
class DriverRobo extends Robo{
	public void driver()
	{
		System.out.println("robo is driving");
	}

}






