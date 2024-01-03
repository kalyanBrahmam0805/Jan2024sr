package oop;
import java. util.Scanner;
public class swao {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter + or - or * or /");
	         char opt =sc.next().charAt(0);
	    switch(opt) {
	    
	    
	    	case '+':
	    		System.out.println("addition operator");
	    		break;
	    	case '-':
	    		System.out.println("sub operator");
	    		break;
	    	case '*':
	    		System.out.println("mul operator");
	    		break;
	    	case '/' :
	    		System.out.println("div operaor");
	    		break;
	    	default:
	    	System.out.println("enter correct operator ");
	         
	}
	}

}
