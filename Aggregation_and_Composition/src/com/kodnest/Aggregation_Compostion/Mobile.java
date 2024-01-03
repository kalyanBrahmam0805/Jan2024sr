package com.kodnest.Aggregation_Compostion;

public class Mobile {
	OS os =new OS(32,"Andriod");
	Charger ref;
	public void HasA(Charger ref)
	{
		//this.ref=ref;
		System.out.println(ref.getBrand());
		System.out.println(ref.getColour());
		System.out.println(ref.getType());
		
	}
	
}
