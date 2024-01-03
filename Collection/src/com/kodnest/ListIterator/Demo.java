package com.kodnest.ListIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add(50);
		ll.add(150);
		ll.add(25);
		ll.add(175);
		System.out.println(ll);
		ListIterator itr=ll.listIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous() +" ");
		}
		
		
	}

}
