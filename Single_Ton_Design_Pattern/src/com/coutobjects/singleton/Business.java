package com.coutobjects.singleton;

public class Business {
	static private int objectcount=0;
	public Business()
	{
		objectcount++;
	}
	static public int getobject() {
		return objectcount++;
	}
	

}
