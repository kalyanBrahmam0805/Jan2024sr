package com.kodnest.LinkedList;

import java.util.LinkedList;

public class Demoo {
	public static void main(String[] args) {
		LinkedList ll1=new LinkedList();
		ll1.add(100);
		ll1.add(50);
		ll1.add(150);
		ll1.add(25);
		System.out.println(ll1);
		LinkedList ll2=new LinkedList();
		ll2.add(10);
		ll2.add(2);
		ll2.add(7);
		ll2.add(12);
		ll2.add(2);
		System.out.println(ll2);
		ll1.push(99);
		System.out.println(ll1);
		ll1.push(999);
		System.out.println(ll1);
		ll1.pop();
		System.out.println(ll1);
		ll1.pop();
		System.out.println(ll1);
		System.out.println(ll1.peek());
		System.out.println(ll2.peek());
		System.out.println(ll2);
		System.out.println(ll1.poll());
		System.out.println(ll1);
		System.out.println(ll1.peekFirst());
		System.out.println(ll1);
		System.out.println(ll1.peekLast());
		System.out.println(ll1);
		System.out.println(ll1.pollFirst());
		System.out.println(ll1);
		System.out.println(ll1.pollLast());
		System.out.println(ll1);
	     ll2.add(900);
	     System.out.println(ll2);
	     ll2.offer(999);
	     System.out.println(ll2);
	     ll2.offerLast(80);
	     ll2.offerLast(888);
	     System.out.println(ll2);
	     LinkedList ll3=new LinkedList();
	     ll3.add(300);
	     ll3.add(301);
	     ll3.add(2);
	     ll3.add(7);
	     System.out.println(ll3);
	     ll3.retainAll(ll2);
	     System.out.println(ll3);
	     ll3.add(1,9000);
	     System.out.println(ll3);
	     ll3.set(1,1000);
	     System.out.println(ll3);
		
	}

}
