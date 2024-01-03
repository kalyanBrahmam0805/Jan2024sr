package com.kodnest.inheritance;

public class Teacher {
	String name;
	String subject;
	public void markattendance() {
		System.out.println("name"+"Attendance is marking");	
	}
	public void teach()
	{
		System.out.println("name"+"Teacher is Teaching");
	}
} 
class physicalTeacher extends Teacher{
	public void dolawsexp(){
		System.out.println("Do laws exp");
	}
	}
class chemistryTeacher extends Teacher{
	public void dpchemicalexp() {
		System.out.println("Do chemical exp");
	}
}
class biologyTeacher extends Teacher{
	public void dodisctntionexp() {
		System.out.println("Do Distnction exp");
	}
	
}