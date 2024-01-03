package com.leetcode.arrayproblems;

import java.util.Scanner;

public class prblm3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		}
		if(temp==rev) {
			System.out.println("Entered num is a palindrome");
		}
		else
		{
			System.out.println("Entered num is not a palindrome");
		}
		
		}
		
	}

