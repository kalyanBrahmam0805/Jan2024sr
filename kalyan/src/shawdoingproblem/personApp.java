package shawdoingproblem;

import java.util.Scanner;

public class personApp {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id");
		int id=scan.nextInt();
		System.out.println("Enter name");
		scan.nextLine();
		String name=scan.nextLine();
		System.out.println("Enter Gender");
		String gender=scan.nextLine();
		System.out.println("Enter Email");
		String email=scan.next();
		System.out.println("Enter phone No");
		long  phno=scan.nextLong();
		person p=new person(id,name,gender,email,phno);
		System.out.println(p.id+" "+p.name+" "+p.gender+" "+p.email+" "+p.phno);
	}

}
