package com.kodnest.raceroundcond;

public class InterviewApp {
public static void main(String[] args) {
	Interview i=new Interview();
	Thread t=new Thread(i);
	Thread t1=new Thread(i);
	Thread t2=new Thread(i);
	t.setName("Nerella");
	t1.setName("Kalyan");
	t2.setName("Brahmam");
	t1.start();
	t.start();
	t2.start();
			
}
}
