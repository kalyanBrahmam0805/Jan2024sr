package oop;
import java .util.Scanner;

public class elgvote {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("elgible for voting");
		}
		else {
		    System.out.println("Not eligible for voting");
			
		}
		}

}
