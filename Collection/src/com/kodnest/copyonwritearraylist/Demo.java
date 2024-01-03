package com.kodnest.copyonwritearraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
	public static void main(String[] args) {

		CopyOnWriteArrayList al =new CopyOnWriteArrayList();
		al.add("Shirt,2000");
		al.add("pant ,4000");
		al.add("Shoe,21000");
		al.add("watch,100");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			al.add("Jewel,1000");
		}
		System.out.println(al); 
	}



}
