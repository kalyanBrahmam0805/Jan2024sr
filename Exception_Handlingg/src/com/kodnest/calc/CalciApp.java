package com.kodnest.calc;

public class CalciApp {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		try {
			c.add();
			c.sub();
			c.mul();
			c.div();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
