package com.kodnest.encap;

public class classroom {
	private int temp;
	public void settemperature(int x) {
		if(x>10 && x<35)
		{
			temp=x;

		}		
		else
		{
			System.out.println("Invalid Temp");
		}
	}
	public int gettemp() {
		return temp;
	}

}




