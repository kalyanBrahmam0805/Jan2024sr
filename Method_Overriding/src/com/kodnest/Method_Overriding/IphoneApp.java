package com.kodnest.Method_Overriding;

public class IphoneApp {
	public static void main(String[] args) {
		Iphone i=new Iphone();
		i.os();
		i.design();
		System.out.println("================================");
		Iphone4 i4=new Iphone4();
		i4.os();
		i4.design();
		i4.display();
		System.out.println("===============================");
		Iphone6 i6=new Iphone6();
		i6.os();
		i6.design();
		i6.unclockusingfpi();
		System.out.println("===========================");
		Iphone10 i10=new Iphone10();
		i10.os();
		i10.design();
		i10.unlocklusingface();
		
	}

}
