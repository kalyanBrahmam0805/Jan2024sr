package com.kodnest.complex.objects;

public class Employee implements Comparable {
	String name;
	int id;
	String Gender;
	int salary;
	public Employee(String name,int id,String Gender,int salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.Gender=Gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String toString()
	{
		return name+" "+id+" "+Gender+" "+salary;	
	}


	//	public int compareTo(Object o) {
	//		if(this.id>o.id)
	//		{
	//			return 1;                  
	//
	//		}
	//		else 
	//		{
	//			return -1;
	//		}
	//
	//	}
	public int compareTo(Object o) {
		Employee otherEmployee = (Employee) o;
			if (this.id > otherEmployee.id) {
				return 1;	
			}
			else 
			
			{
				return 0;
			}
		
	
		
	}
}





