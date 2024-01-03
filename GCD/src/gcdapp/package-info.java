package gcdapp;
import java.util.Scanner;
class gcd{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		while(n!=0) {
			int rem=m%n;
			rem=n;
			n=m;
		}
		System.out.println(m);
	}
}