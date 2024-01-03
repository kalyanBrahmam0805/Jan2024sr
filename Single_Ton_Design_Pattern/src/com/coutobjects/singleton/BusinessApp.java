package com.coutobjects.singleton;

public class BusinessApp {
	public static void main(String[] args) {
		Business b1=new Business();
		Business b2=new Business();
		Business b3=new Business();
		System.out.println("No of objects in the class:"+Business.getobject());
	}

}
