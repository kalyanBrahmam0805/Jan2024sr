package com.kodnest.singleton;

public class Primeminister {
	static private Primeminister pm=null;
	String name;
	int age;
	String gender;
	private Primeminister(String name,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void attendmeeting()
	{
		System.out.println(name+"Prime Minister is Attend Meeting");
	}
	public void maintaingoodrelationship()
	{
		System.out.println(name+"prime minister is maintaining good relatonships");
	}
	
	public void takecare()
	{
		System.out.println("Prime minister is takecaring of the citizens");
	}
	public static Primeminister getinstance() {
		if(pm==null)
		{
			pm=new Primeminister("Modi",75,"Male");
		}
		return pm;
	}
	

}
