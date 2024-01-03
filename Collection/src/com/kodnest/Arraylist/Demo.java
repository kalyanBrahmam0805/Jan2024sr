package com.kodnest.Arraylist;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(55);
		al.add(25);
		System.out.println(al);
		al.add(2,9999);
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		System.out.println(al2);
		al.addAll(al2);
		System.out.println(al);
		ArrayList al3=new ArrayList();
		al3.add(10);
		al3.add(20);
		al3.add(30);
		al3.add(40);
		al3.add(50);
		System.out.println(al3);
		al.addAll(5,al3);
		System.out.println(al);
		System.out.println(al.contains(100));
		System.out.println(al3.get(1));
		System.out.println(al3.indexOf(50));
		System.out.println(al3.isEmpty());
		System.out.println(al3.remove(4));
		System.out.println(al3.size());
		
}
}