package com.kod.Maps;

public class citizen {
	String name;
	int age;
	String gender;
	int ph;
	String email;
	public citizen(String name,int age,String gender,int ph,String email)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.ph=ph;
		this.email=email;
	}
	
   

public String toString()
   {
	   return name+" "+age+" "+gender+" "+ph+" "+email;
   }
}
