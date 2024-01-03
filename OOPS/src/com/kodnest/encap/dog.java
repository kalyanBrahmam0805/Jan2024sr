package com.kodnest.encap;

public class dog {
	private int age;
	private String name;
	private int dogteeth;
	private String breed;
	public dog (String name,String breed,int dogteeth,int age) {
		this.name=name;
		this.breed=breed;
		this.dogteeth=dogteeth;
		this.age=age;
		 
		
	}
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	
	public int getdogteeth() {
		return dogteeth;
	}
	
	
	public String getbreed() {
		return breed;
	}
	
	

}
