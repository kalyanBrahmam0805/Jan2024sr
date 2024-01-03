package kalyanstr;

import java.util.Scanner;

public class Reverse_a_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char []arr1=s1.toCharArray();
		char []arr2=new char[arr1.length];
		int j=arr1.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[j]=arr1[i];
			j--;
		}

		s1=new String(arr2);
		System.out.println("After reversing====>"+s1);

	}

}
