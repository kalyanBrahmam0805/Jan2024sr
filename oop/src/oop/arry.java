package oop;
import java.util.Scanner;
	public class arry {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int arr[][]=new int[4][];
			arr[0]=new int[2];
			arr[1]=new int[4];
			arr[2]=new int[3];
			arr[3]=new int[2];
			for(int i=0;i<=arr.length-1;i++)
			{
				for (int j=0;j<=arr[i].length-1;j++)
				{
					System.out.println("Enter the marks of class"+i+"student"+j);
				arr[i][j]=sc.nextInt();	
				}
			}
			System.out.println("array contents are:");
			for(int i=0;i<=4;i++)
			{
				
			
				for (int j=0;i<=4;j++)
				{
				System.out.println(arr[i][j]+" ");
					
				}
			}
		}

	}

