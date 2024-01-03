package Rerverse_Sorting;

import java.util.concurrent.Callable;

public class Employee  {

	int id;
	String name;
	int age;
	String gender;
	public Employee(int id, String name, int age, String gender) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String toString()
	{
		return name+ " "+id+ " "+age+" "+gender;

	}

}