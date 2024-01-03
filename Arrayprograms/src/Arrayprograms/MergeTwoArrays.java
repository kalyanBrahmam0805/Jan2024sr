package Arrayprograms;
import java.util.*;
public class MergeTwoArrays {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of first length array");
	int arr1[]=new int[sc.nextInt()];
	for(int i=0;i<=arr1.length-1;i++)
	{
	arr1[i]=sc.nextInt();
   }
	System.out.println("enter the size of second  length array");
     int arr2[]=new int[sc.nextInt()];
   for(int i=0;i<=arr2.length-1;i++)
	{
		arr2[i]=sc.nextInt();
	}
   int x = 0;
	int arr3[]=new int[arr1.length+arr2.length];
	for(int i=0;i<=arr1.length-1;i++)
	{
		arr3[x]=arr1[i];
		x++;
	}
	for(int i=0;i<=arr2.length-1;i++)
	{
		arr3[x]=arr2[i];
		x++;
	}	
	for(int a:arr3) {
		System.out.print(a + " ");
	}
	
}
}

	