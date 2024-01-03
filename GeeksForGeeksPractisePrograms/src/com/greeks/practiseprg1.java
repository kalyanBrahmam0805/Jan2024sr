package com.greeks;
import java.util.Scanner;
public class practiseprg1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[] = {1,2,3,7,5};
		int s = 12;
		int sum = 0,i=0,x=0;
		int l=0;
		while(sum!=s)
		{
			sum=0;l=x;
			for( i = x; i<a.length; i++)
			{
				 sum = sum+a[i];
				 if(sum==s)
					 break;
				 l++;
			}
			x++;
		}
		System.out.println(x + " " + (l+1));
	}
	


}
