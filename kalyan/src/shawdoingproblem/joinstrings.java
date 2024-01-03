package shawdoingproblem;
import java.util.Scanner;

public class joinstrings 
{
     public static void main(String[] args)
    {
	     Scanner sc=new Scanner(System.in);
	     String str1=sc.next();
	     String str2=sc.next();
	      System.out.println(joiningstrings(str1,str2));
}

public static String joiningstrings(String str1,String str2) {
	return str1+str2;
}
}

