package com.kodnest.inheritance;

public class roboapp  extends Robo{
	public static void main(String[] args) {
		TeacherRobo teacher=new TeacherRobo();    
		teacher.name="mario";
		teacher.type="windows";
		teacher.walk();
		teacher.talk();
		teacher.teach();
		System.out.println("+++++++++++++++++++++++++++++++++++");
		chefrobo chefRobo=new chefrobo();
		chefRobo.name="Amy jackson";
		chefRobo.type="HumanFenoid";
		chefRobo.talk();
		chefRobo.walk();
		chefRobo.charge();
		chefRobo.cook();
		System.out.println("+++++++++++++++++++++++++++++++++++");
		driverrobo driverRobo=new driverrobo();
		driverRobo.name="Will Smith";
		driverRobo.type="AndroBrainoid";
		driverRobo.talk();
		driverRobo.walk();
		driverRobo.charge();
		driverRobo.driver(); 




	}

}
