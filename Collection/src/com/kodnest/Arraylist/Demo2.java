
package com.kodnest.Arraylist;

import java.util.ArrayList;

public class Demo2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(true);
		al.add(90.78);
		al.add("Raja");
		System.out.println(al);
		ArrayList<Integer>al2=new ArrayList<Integer>();
		al2.add(200);
		//al2.add("Raja");
		System.out.println(al2);
		System.err.println();
		
	}

}
