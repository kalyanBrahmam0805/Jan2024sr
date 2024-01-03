package Arrayprogramslevel3;
import java.util.Scanner;
public class add2array3arr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first array length");
		int a=sc.nextInt();
		int arr1[]=new int[a];
		
		for(int i=0;i<=arr1.length-1;i++) 
		{
			arr1[i]=sc.nextInt();
	    }
		System.out.println("Enter the second array length");
		int arr2[]=new int[sc.nextInt()];
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("Resultant array is :");
		int arr3[]=new int[a];
		for(int i=0;i<=arr3.length-1;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		for(int x:arr3)
		{
		System.out.print(x+" ");
		}
	}

}
