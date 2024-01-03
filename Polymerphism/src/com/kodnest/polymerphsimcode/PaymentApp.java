package com.kodnest.polymerphsimcode;

public class PaymentApp {
	public static void main(String[] args) {
		
		Payment ref;
				ref=new upi();
				ref.checkbalance();
				ref.sendNotification();
				ref.Applycode();
				ref.pay();
				System.out.println("==============");
				ref =new Card();
				ref.checkbalance();
				ref.sendNotification();
				ref.Applycode();
				ref.pay();
				System.out.println("============");
				ref=new Wallet();
				ref.checkbalance();
				ref.sendNotification();
				ref.Applycode();
				ref.pay();
				
				
		
		 
		
		
	
	}

}
