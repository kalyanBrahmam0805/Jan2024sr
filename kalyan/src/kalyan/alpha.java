package kalyan;

import java.util.Scanner;
public class alpha {
//public static void main(String[] args) {
	public static void identifyCharacter(char ch) {
	Scanner sc=new Scanner(System.in);
	
	char ch=sc.next().charAt(0);
	if(ch>='a' && ch<='z')
	{
		System.out.println("Lower case character");
	}
	else if(ch>='A' && ch<='Z')
	{
		System.out.println("upper case character");
	}
    else if(ch>='0' && ch<='9'){
    	System.out.println("digit");
    }
    	
}
public static void identifyCharacter(char ch) {
	alpha a=new alpha();

}





}

