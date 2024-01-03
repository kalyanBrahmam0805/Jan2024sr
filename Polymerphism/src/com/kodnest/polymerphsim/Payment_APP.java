package com.kodnest.polymerphsim;

public class Payment_APP {
	public static void main(String[] args) {
		upi u =new upi();
		u.checkbalance();
		u.sendNotification();
		u.Applycode();
		u.pay();
		System.out.println("=====================");
		Card c=new Card();
		c.checkbalance();
		c.sendNotification();
        c.Applycode();
        c.pay();
        System.out.println("=========================");
        Wallet w =new Wallet();
        w.checkbalance();
        w.sendNotification();
        w.Applycode();
        w.pay();
       
       
        }

}
