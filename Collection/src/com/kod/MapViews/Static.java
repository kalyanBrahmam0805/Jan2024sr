package com.kod.MapViews;

import java.util.ArrayList;
import java.util.Collections;

public class Static {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Yamuna");
		al.add("Ganga");
		al.add("Kaveri");
		al.add("Narmadha");
		al.add("Sindhu");
		al.add("Ganga");
		al.add("Cauveri");
		al.add("Sarswathi");
		al.add("Ganga");
		System.out.println(al);
		System.out.println("===================");
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		//System.out.println(Collections.shuffle(al));
		System.out.println(Collections.frequency(al, "Ganga"));
		//System.out.println(Collections.rotate(al, 1));
		
		
		
		
	}

}
