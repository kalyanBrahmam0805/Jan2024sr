package com.kodnest.singleton;

public class PmApp {
	public static void main(String[] args) {
		Primeminister pm1=Primeminister.getinstance();
		Primeminister pm2=Primeminister.getinstance();
		System.out.println(pm1);
		System.out.println(pm2);
	}

}
