package com.kodnest.WithDaemon;

public class SessionApp {
	public static void main(String[] args) {
		SessionConductance t1=new SessionConductance();
		AudioCheck t2=new AudioCheck();
		VideoCheck t3=new VideoCheck();
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t2.setPriority(1);
		t3.setPriority(1);
		
		
		t1.start();
		t2.start();
		t3.start();

	}

}
