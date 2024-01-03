package july20;
import java.util.Scanner;
public class age{
	public static void main(String[] args){ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age");
	int age=sc.nextInt();
    categorizeAge(age);		
}


		

		public static void categorizeAge(int age) {
		if(age>=0 && age<=12){
			System.out.println("Child");
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teenage");
		}
		else if (age>=20 && age<=59) {
			System.out.println("adult");
		}
		else {
			System.out.println("Senior");
		}

		}	

}
	
		
