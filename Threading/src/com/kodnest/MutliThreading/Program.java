package com.kodnest.MutliThreading;

public class Program {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Tom");
		t.setPriority(2);
		System.out.println(t);
		
	}

}
