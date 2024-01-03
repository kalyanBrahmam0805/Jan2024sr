package com.kodnest.encap;

public class studentapp {
	public static void main(String[] args) {
		student s=new student();
		s.setid(101);
		s.setname("Kalyan");
		s.setmarks(99);
		s.setgender("Male");
		System.out.println(s.getid());
		System.out.println(s.getname());
		System.out.println(s.getmarks());
		System.out.println(s.getgender());
		
	}

}
