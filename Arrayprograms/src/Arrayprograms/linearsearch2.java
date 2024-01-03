package Arrayprograms;
import java.util.Scanner;
public class linearsearch2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int arr[]=new int[a];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	int target=sc.nextInt();
	int res=linearsearch2app.search(arr,target);
	if(res==0)
	{
		System.out.println("Target not found");
	}
	else
	{
		System.out.println(" target found");
	}
}
}