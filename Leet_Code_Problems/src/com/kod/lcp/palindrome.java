package com.kod.lcp;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		int rem=0;
		
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
		   rev=rev*10+rem;
			num=num/10;
			
		}
		//System.out.println(rev);
	
	if(temp==rev)
	{
		System.out.println("Number is a Palindrome");
	}
	else
	{
		System.out.println("Number is Not a Palindrome");
	}
	}
	

}
