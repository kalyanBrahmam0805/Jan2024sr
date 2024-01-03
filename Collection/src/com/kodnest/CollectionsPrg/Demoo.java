package com.kodnest.CollectionsPrg;

import java.util.HashSet;
import java.util.Iterator;

public class Demoo {
	public static void main(String[] args) {
		HashSet ref=new HashSet();
		ref.add(100);
		ref.add(50);
		ref.add(150);
		ref.add(25);
		ref.add(75);
		System.out.println(ref);
		
		Iterator itr=ref.iterator();
		//Iterator<Integer> itr = ref.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next()+" ");
		 }
		 
//		 package com.kodnest.CollectionsPrg;
//
//		 import java.util.HashSet;
//		 import java.util.Iterator;
//
//		 public class Demoo {
//		     public static void main(String[] args) {
//		         HashSet<Integer> ref = new HashSet<>();
//		         ref.add(100);
//		         ref.add(50);
//		         ref.add(150);
//		         ref.add(25);
//		         ref.add(75);
//		         System.out.println(ref);
//
//		         Iterator<Integer> itr = ref.iterator();
//		         while (itr.hasNext()) {
//		             System.out.println(itr.next() + " ");
//		         }
//		     }
//		 }
//
//		
	}

}
