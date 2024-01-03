package oop;
import java .util.Scanner;
public class LaptopApp {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the mobile price");
	    int price=sc.nextInt();
	    System.out.println("please enter ram size");
	    int ram=sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter the Brand name");
	    String brand=sc.nextLine();
	    System.out.println("Enter the processor name");
	    String processor=sc.nextLine();
	    System.out.println("Emter the Memory size");
	    int memory=sc.nextInt();
	    System.out.println("Enter the Storage");
	    int storage=sc.nextInt();
	    Laptop l=new Laptop(price,ram,brand,processor,memory,storage);
	    System.out.println(l.price);
	    System.out.println(l.ram);
	   System.out.println(l.brand);
	   System.out.println(l.processor);
	   System.out.println(l.memory);
      System.out.println(l.storage);
	    
		
		
	}

}
