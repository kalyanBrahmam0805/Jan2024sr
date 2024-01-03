package july20;
import java.util.Scanner;

	public class vendingmaccalc
	{
	

	public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product code");
		String productCode=sc.next();
		getProduct(productCode);
					
}

	public static void getProduct(String productCode)

	{
    if (productCode=="p01"){
    	System.out.println("cola cola");
    }
    else if(productCode=="po2")
    	{
    	System.out.println("Thumspup");
        }
    else if(productCode=="po3") {
    	System.out.println("Maaza");
       }


	
}
}