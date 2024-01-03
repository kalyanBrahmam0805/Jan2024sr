package com.kodnest.complex.objects;

import java.util.ArrayList;
import java.util.Collections;

public class simpleobjsorting {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Employee e1=new Employee("Sahana", 100, "Femlae",10000);
		Employee e2=new Employee("Sindhu",50,"Female",20000);
		Employee e3=new Employee("Swathi",150,"Female",30000);
		Employee e4=new Employee("shilpa",75,"Female",40000);
		Employee e5=new Employee("Shruthi",25,"Female",50000);
		al.add(e5);
		al.add(e4);
		al.add(e3);
		al.add(e2);
		al.add(e1);
		System.out.println("===================");
		Collections.sort(al);
		System.out.println(al);
	}

}
