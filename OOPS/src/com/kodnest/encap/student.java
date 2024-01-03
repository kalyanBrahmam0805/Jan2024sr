package com.kodnest.encap;

public class student {
	private int id;
	private String name;
	private int rollno;
	private int marks;
	private String gender;
	public  int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public int getrollno() {
		return rollno;
	}
	public int getmarks() {
		return marks;
	}
	public String getgender() {
		return gender;
		
	}
	public void setid(int id) {
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setmarks(int marks) {
		this.marks=marks;
	}
	public void setgender(String gender)
	{
		this.gender=gender;
	}


}