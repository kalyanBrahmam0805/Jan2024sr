package com.kodnest.synchronize;

public class InterviewApp {

	public static void main(String[] args) {
		Interview t1=new Interview();
		Interview t2=new Interview();
		t1.setName("Mustaffa");
		t2.setName("Avinash");
		t1.start();
		t2.start();
		

	}

}
