package com.kodnest.MutliThreading;

public class JavasessionssApp {
	public static void main(String[] args) {
		
		System.out.println("Java Session is Started");
		JavaSession js =new JavaSession();
		Thread t1=new Thread(js);
		t1.start();
		System.out.println("Java Session Ended");

}
}
