package Arrayprograms;
import java.util.Scanner;
public class Enhanceforloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int []arr=new int[a];
		for(int i=0;i<arr.length-1;i++)
		{
		arr[i]=sc.nextInt();
		}
		for(int x:arr)
		{
			System.out.println(x);
		}
		
	}

}
