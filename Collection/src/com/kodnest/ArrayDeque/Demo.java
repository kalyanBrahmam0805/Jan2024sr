package com.kodnest.ArrayDeque;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(2200);
		ad.add("Kalyan");
		ad.add(23.45);
		ad.add(true);
		ad.addFirst(1);
		ad.addLast("END");
//		ad.add(1,233)
		System.out.println(ad);
		LinkedList ll=new LinkedList();
		
	}

}
