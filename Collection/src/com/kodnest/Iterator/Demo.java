package com.kodnest.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Shirt, 2000");
		al.add("pant ,4000");
		al.add("Shoe,8000");
		al.add("watch,10000");
//		for(int i=0;i<al.size()-1;i++)
//		{
//			System.out.println(al.get(i));
//			al.add("Jewel,10000");
//		}
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			al.add("jewel,10000");
		}
		
		
		
		}
		
		
	}


