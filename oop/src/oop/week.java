package oop;

import java.util.Scanner;

public class week 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter bn 0-7");
	int num=sc.nextInt();
	
	switch(num) {
	case 1:
	System.out.println(" super monday");
	break;
	case 2 :
	System.out.println(" boring Tuesday");
	break;
	case 3 :
		System.out.println(" wednesday");
		break;
	case 4 :
		System.out.println("Friday");
		break;
	case 5 :
		System.out.println("saturday");
		break;
	case 6:
		System.out.println("sunday");
		break;
	default :
		System.out.println("Enter b/n range 0-7");
	}										
		
}
}
