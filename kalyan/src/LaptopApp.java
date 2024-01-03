
import java.util.*;
public class LaptopApp {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Display size");
		int d=sc.nextInt();
		System.out.println("Enter the weight");
		int e=sc.nextInt();
		Laptop l=new Laptop();
		l.watch();
		l.read();
	}

}
