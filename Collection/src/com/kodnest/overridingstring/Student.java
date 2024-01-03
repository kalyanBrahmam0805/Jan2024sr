package com.kodnest.overridingstring;

public class Student {
	String Name;
	int age;
	int id;
	public Student(String Name,int age, int id)
	{
		this.age=age;
		this.id=id;
		this.Name=Name;
	}
	public String toString()
	{
		return " Name = " + Name+ "age = " +age  +id ;
		
	}

}
