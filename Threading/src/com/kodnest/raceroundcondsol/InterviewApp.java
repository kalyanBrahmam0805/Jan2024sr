package com.kodnest.raceroundcondsol;

public class InterviewApp {
	public static void main(String[] args) {
		Interview I=new Interview();
		Thread t1=new Thread(I);
		Thread t2=new Thread(I);
		Thread t3=new Thread(I);
		t1.setName("Nerella");
		t2.setName("Kalyan");
		t3.setName("Brahmam");
		t1.start();
		t2.start();
		t3.start();
		
	}
	

}
