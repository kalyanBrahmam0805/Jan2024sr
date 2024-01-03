package com.kodnest.oops;

public class roboapp {
		public static void main(String[] args) {
		TeacherRobo teacher=new TeacherRobo();
		ChefRobo chefRobo=new ChefRobo();
		DriverRobo driverRobo=new DriverRobo();
		    teacher.name="mario";
			teacher.type="windows";
			teacher.walk();
			teacher.talk();
			teacher.teach();
			System.out.println("+++++++++++++++++++++++++++++++++++");
			chefRobo.name="Amy jackson";
			chefRobo.type="HumanFenoid";
			chefRobo.talk();
			chefRobo.walk();
			chefRobo.charge();
			chefRobo.cook();
			System.out.println("+++++++++++++++++++++++++++++++++++");
			driverRobo.name="Will Smith";
			driverRobo.type="AndroBrainoid";
			driverRobo.talk();
			driverRobo.walk();
			driverRobo.charge();
			driverRobo.driver(); 




		}

	}



