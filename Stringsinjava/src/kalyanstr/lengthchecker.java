package kalyanstr;

import java.util.Scanner;

public class lengthchecker {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.length()==s2.length())
		{
			System.out.println("Strings lengths are Equal");
		}
		else
		{
			System.out.println("String lengths are kaluan not equal");
		}
		
	}

}
