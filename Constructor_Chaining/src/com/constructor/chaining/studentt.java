package com.constructor.chaining;

public class studentt {
	String name;
	int age;
	public studentt() {
		super();
	}
	public studentt(String name,int age) {
		super();
		this.name=name;
		this.age=age;

	}
	public studentt(String name)
	{
		this();
		this.name=name;
		age=21;
	}
}
class enggstudent extends studentt{
	int marks;
	int sem;
//	public enggstudent()
//	{
//		super();
//	}
//	
	public enggstudent(String name)
	{
		super();
		this.name=name;
	}
	public enggstudent(String name,int age) 
	{
		this.name=name;
		this.age=age;

	}

	public enggstudent(String name,int age,int marks) {
		
		this.age=age;
		this.marks=marks;
		this.name=name;

	}
	public enggstudent(String name,int age,int marks,int sem)
	{
       //this();
		this.age=age;
		this.marks=marks;
		this.name=name;
     	this.sem=sem;
	}
	
}


