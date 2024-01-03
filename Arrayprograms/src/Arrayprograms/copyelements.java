package Arrayprograms;
import java.util.Scanner;
public class copyelements {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[sc.nextInt()];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	int arr1[]=new int[arr.length];
	for(int i=0;i<=arr.length-1;i++) {
		arr1[i]=arr[i];
	}
	
	for(int x:arr1) {
		System.out.print(x);
	}
	
	
}
}
