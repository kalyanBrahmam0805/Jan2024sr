package com.kodnest.MutliThreading;

public class MultiThreadingApp {
	public static void main(String[] args) {
	Addition a=new Addition();
	Printing p=new Printing();
	p.start();
	a.start();

}
}