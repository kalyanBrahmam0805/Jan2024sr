package kalyanstr;

import java.util.Scanner;

public class stringconcat {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String b=sc.next();
	if(a.equals(b))
	{
		System.out.println(a.concat(b));
	}
	else
	{
		System.out.println("Does not concate");
	}
	
	
	
}
}
