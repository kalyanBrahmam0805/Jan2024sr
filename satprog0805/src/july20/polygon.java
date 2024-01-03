package july20;
import java.util.Scanner;
public class polygon{
	public static void main(String[] args)

	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No of Sides");
	int a=sc.nextInt();
	identifyPolygon(a);
	
}
	
public static void identifyPolygon(int a) {
  if(a==3) {
	System.out.println("Traingle");
  	}
  	else if(a==4) {
	System.out.println("Quadrilateral");
	}
  	else if(a==5) {
	System.out.println("pentagon");
  	}
  	else if(a==6){
	System.out.println("hexagon");
  	}
  	else {
	System.out.println("plz enter bn 3-6");
    }
}
}










