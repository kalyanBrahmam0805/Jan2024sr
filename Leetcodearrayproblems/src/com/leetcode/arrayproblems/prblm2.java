package com.leetcode.arrayproblems;
//reverse the number
import java.util.Scanner;

public class prblm2 {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int reverse = 0;
		while(number!=0)
		{
			int rem=number%10;
			reverse=reverse*10+rem;  
			number=number/10;

		}

		System.out.println(reverse);
        if(number==reverse)
        {
        	System.out.println("Entered num is a palindrome");
        }
        else {
        	System.out.println("Number is not a palindrome");
        }
	}   


}



