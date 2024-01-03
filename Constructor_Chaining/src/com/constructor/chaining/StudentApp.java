package com.constructor.chaining;

public class StudentApp extends student {
	public static void main(String[] args) {
		student s =new student("kalyan",23);
		System.out.println(s.name+" "+s.age);
	}

}
