package Arrayprograms;
import java.util.*;
public class Demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[sc.nextInt()];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	findNegative(arr);
}
public static void findNegative(int arr[])
{
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==-1)
		{
			count++;
		}
	}
	int n=arr.length;
	int index=n-1;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!=-1)
		{
			arr[index++]=arr[i];
		}
	}
	while(count>0)
	{
		arr[index--]=-1;
		count--;
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
