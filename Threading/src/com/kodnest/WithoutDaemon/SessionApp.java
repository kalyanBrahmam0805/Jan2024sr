package com.kodnest.WithoutDaemon;

public class SessionApp {
	public static void main(String[] args) {
		SessionConductance t1=new SessionConductance();
		AudioCheck t2=new AudioCheck();
		VideoCheck t3=new VideoCheck();
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
