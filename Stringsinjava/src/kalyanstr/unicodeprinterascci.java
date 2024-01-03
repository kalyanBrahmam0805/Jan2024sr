package kalyanstr;

import java.util.Scanner;

public class unicodeprinterascci {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	String s1 =sc.next();
//	char s2[]=s1.toCharArray();
//	for(int x: s2)
//	{
//		System.out.println(x);
//	}
	
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	for(int i=0;i<=s1.length();i++)
	{
		char ch=s1.charAt(i);
		int a=ch;
		System.out.println(a);
	}
	
}
}
