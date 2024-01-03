package com.kodnest.complex.objects;

import java.util.ArrayList;

public class Sorting {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Employeee e1=new Employeee("Sahana",100,"Female",10000);
		Employeee e2=new Employeee("Sindu",50,"Female",20000);
		Employeee e3=new Employeee("Swathi",150,"Female",30000);
		Employeee e4=new Employeee("Shruthi",25,"Female",40000);
		Employeee e5=new Employeee("Shilpa",75,"Female",50000);
		al.add(e5);
		al.add(e4);
		al.add(e3);
		al.add(e2);
		al.add(e2);
		al.add(e1);
		System.out.println(al);
	
		
	}

}
