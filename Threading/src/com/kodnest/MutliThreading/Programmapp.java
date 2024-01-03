package com.kodnest.MutliThreading;

public class Programmapp {
	public static void main(String[] args) {
		Programm t1=new Programm();
		Programm t2=new Programm();
	//((Object) t1).setName();
		t1.setName("Add");
	    t2.setName("Printing");
	    t1.start();
	    t2.start();
		
	}

}
