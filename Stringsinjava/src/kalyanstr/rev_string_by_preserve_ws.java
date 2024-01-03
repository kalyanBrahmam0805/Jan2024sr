package kalyanstr;

import java.util.Scanner;

public class rev_string_by_preserve_ws {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char arr1[]=str.toCharArray();
		char arr2[]=new char[arr1.length];
		//char arr2[]=str.toCharArray();
		//copy the spaces 
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]==' ')
			{
				arr2[i]=arr1[i];
			}
		}
		//rev the char array
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]!=' ')
			
			if(arr2[j]==' ')
			j--;
			arr2[j]=arr1[i];
			j--;

		}
		String str1=new String(arr2);
		System.out.println(str1);
	}

}
