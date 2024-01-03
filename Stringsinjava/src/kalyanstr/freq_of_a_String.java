package kalyanstr;

import java.util.Scanner;

public class freq_of_a_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[]arr=s.toCharArray();

		for(int i=0;i<=arr.length-1;i++)
		{
			int count=1;
			if(arr[i]!=' ')
			{
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=' ';
					}
				}
				System.out.println(arr[i]+"====>"+count);
			}
		}

	}

}
