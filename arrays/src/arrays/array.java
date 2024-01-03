package arrays;
import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[4][5];
		for(int i=0;i<=4;i++)
		{
			for (int j=0;i<=4;j++)
			{
			arr[i][j]=sc.nextInt();	
			}
		}
		System.out.println("array con are:");
		for(int i=0;i<=4;i++)
		{
			
		
			for (int j=0;i<=4;j++)
			{
			System.out.println(arr[i][j]+" ");
				
			}
		}
	}

}
		