package com.kodnest.Aggregation_Compostion;

public class MobileAPP {
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		System.out.println(mobile.os.name);
		System.out.println(mobile.os.type);
		Charger c=new Charger("Black","Samsung","C-Type");
		mobile.HasA(c);
		System.out.println("=================");
		mobile=null;
		System.out.println("Mobile lost");
//		System.out.println(mobile.os.name);
//		System.out.println(mobile.os.type);
		System.out.println(c.getBrand());
		System.out.println(c.getColour());
		System.out.println(c.getType());
	}

}
