package Arrayprograms;
import java.util.*;
public class swaptwoindexarr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	int arr[]=new int[sc.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=sc.nextInt();
	}
	int x=sc.nextInt();
	int y=sc.nextInt();
	int help;
	help=arr[x];
	arr[x]=arr[y];
	arr[y]=help;
	for(int a:arr) {
	System.out.println(a+ " ");
	}
}
}
