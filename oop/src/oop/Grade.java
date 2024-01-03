package oop;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks<50)
		
			System.out.println("D- grade");
		
    	else if(marks>=50 && marks<60) 
    	
              System.out.println("C- Grade");
		
    	else if(marks>=60 && marks<70) 
    		System.out.println("B Grade");
    	
    	
    	else if (marks>=70 && marks<80) 
    		System.out.println(" A Grade");
    	
    	else 
    		System.out.println("A+ Grade");
    	
    	}

}
