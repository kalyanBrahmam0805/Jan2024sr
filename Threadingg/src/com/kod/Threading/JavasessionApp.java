package com.kod.Threading;



public class JavasessionApp {
	public static void main(String[] args) {

		System.out.println("Java Session is Started");
		Javasessions js =new Javasessions();
		Thread t1=new Thread(js);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Java Session Ended");

	}
}


