package Arrayprograms;
import java.util.Scanner;
public class arrayprg1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter array ele");
        // int a=sc.nextInt();
         int arr[]=new int[sc.nextInt()];
         for(int i=0;i<=arr.length-1;i++)
         {
        	 arr[i]=sc.nextInt();  
        }
         System.out.print("Array contents are :");
         for(int i=0;i<=arr.length-1;i++)
         {
        	 System.out.println(arr[i]+" ");
         }
         
         
         
	}

}
