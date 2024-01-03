package Arrayprograms;

import java.util.Scanner;

public class targetindex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[]arr=new int[a];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			
		for(int j=i+1;j<i;j++)
		{	
			
		if(arr[i]+arr[j+1]==target)
		{
		
			System.out.println(i+ " "+j);	
		}
		
		}
	}
}
}

