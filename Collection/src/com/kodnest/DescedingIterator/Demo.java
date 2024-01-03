package com.kodnest.DescedingIterator;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		LinkedList ref =new LinkedList();
		ref.add(100);
		ref.add(50);
		ref.add(150);
		ref.add(175);
		System.out.println(ref);
		Iterator itr=ref.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ArrayDeque ref1=new ArrayDeque();
		ref1.add(100);
		ref1.add(50);
		ref1.add(150);
		ref1.add(175);
		System.out.println(ref1);
		Iterator itr1=ref1.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr1.next());
		}
		TreeSet ref2=new TreeSet();
		ref2.add(100);
		ref2.add(50);
		ref2.add(150);
		ref2.add(175);
		System.out.println(ref2);
		Iterator itr2=ref2.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println();
		}
		
		
		
	}

}
