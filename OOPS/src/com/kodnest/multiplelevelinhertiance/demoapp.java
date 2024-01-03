package com.kodnest.multiplelevelinhertiance;

import com.kodnest.encap.main;

public interface demoapp extends demo1,Demo2,Demo3 {
	public static void main(String[] args) {
		demo1.kalyan();
		Demo2.vikram();
		Demo3.sandesh();
		//System.out.println(da);
	}
	

}
