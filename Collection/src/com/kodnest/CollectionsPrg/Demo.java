package com.kodnest.CollectionsPrg;

import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		TreeSet ref=new TreeSet();
		ref.add(100);
		ref.add(50);
		ref.add(150);
		ref.add(75);
//		for(int i=0;i<=ref.size()-1;i++)
//		{
//		     System.out.println(ref.get(i));
//		}
		for(Object x :ref) {
			System.out.println(x);
		}
	}

}
