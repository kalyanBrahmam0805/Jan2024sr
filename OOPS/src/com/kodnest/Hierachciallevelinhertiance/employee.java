package com.kodnest.Hierachciallevelinhertiance;

public class employee {
	String name;
	int salary;
	public void work() {
		System.out.println("Employee is working");
	}
	public void doingproject() {
		System.out.println("Employee is doing project");
	}
}
class manager extends employee
{
	
}
class developer extends employee
{
	
}
class testing extends employee
{
	
}
class teamlead extends employee
{
	
}
