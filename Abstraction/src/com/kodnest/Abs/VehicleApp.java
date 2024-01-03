package com.kodnest.Abs;

public class VehicleApp {
	public static void main(String[] args) {
		ShowRoom sh=new ShowRoom();
		sh.acceptvehicle(new Car());
		System.out.println("============");
		sh.acceptvehicle(new Bike());
		System.out.println("==============");
		sh.acceptvehicle(new Truck());
		System.out.println("============");
	}

}
