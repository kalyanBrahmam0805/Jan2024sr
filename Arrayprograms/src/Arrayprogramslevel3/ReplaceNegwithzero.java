package Arrayprogramslevel3;
import java.util.Scanner;
public class ReplaceNegwithzero {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size");
	int arr[]=new int[sc.nextInt()];
	System.out.println("Enter The Array elements ");
	for(int i=0;i<=arr.length-1;i++) 
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Replace with Negative elements with zeros are...");
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]<0) 
		{
			arr[i]=0;
		}
	}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
}


