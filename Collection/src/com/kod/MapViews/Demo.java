package com.kod.MapViews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		HashMap ref=new HashMap();
		ref.put(100,"Rachana");
		ref.put(150,"Ramya");
		ref.put(200,"Rakshitha");
		ref.put(250,"Rashmika");
		System.out.println(ref);
		Set s=ref.keySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
		System.out.println("================");
		Collection c=ref.values();
		Iterator i1=c .iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next()+" ");
		}
		System.out.println("=======================");
		Set s1=ref.entrySet();
		Iterator i2=s1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next()+" ");
		}
		
		
	}

}
