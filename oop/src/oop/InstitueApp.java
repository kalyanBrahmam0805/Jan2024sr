package oop;

import java.util.Scanner;

public class InstitueApp {
public static void main(String[] args) {
	

	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Faculty members");
		int faculitymembers=sc.nextInt();
		System.out.println("Enter number of students");
		int students=sc.nextInt();
		sc.nextLine();
		System.out.println("enter Ins name");
		String Institutename=sc.nextLine();
		System.out.println("enter class name");
		String classname=sc.nextLine();
		System.out.println("enter classrooms");
		int classrooms=sc.nextInt();
		System.out.println("enter boards in the class");
		int boards=sc.nextInt();
		Institute i= new Institute(faculitymembers,students,Institutename,classname,classrooms,boards);
		
		
		
		
	}

}
