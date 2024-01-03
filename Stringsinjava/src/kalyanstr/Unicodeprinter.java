package kalyanstr;

import java.util.Scanner;

public class Unicodeprinter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		byte []ch1=s1.getBytes();
		System.out.println("unicode of each chars of s1--->");
		for(byte b:ch1)
		{
			System.out.println(b+" ");
		}
		String s2=sc.next();
		byte []ch2=s2.getBytes();
		System.out.println("uniocde of each character in string 2==>");
		for(byte b:ch2)
		{
			System.out.println(b);
		}
		
		
		
	}

}

