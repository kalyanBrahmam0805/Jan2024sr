package com.kodnest.MutliThreading;

public class JavaSessionApp {
	public static void main(String[] args) {
		JavaSession js=new JavaSession();
		Thread t1=new Thread(js);
		Thread t2=new Thread(js);
		t1.setName("Kalyan");
		t2.setName("Brahmam");
		t1.start();
		t2.start();
		
		
	}

}
