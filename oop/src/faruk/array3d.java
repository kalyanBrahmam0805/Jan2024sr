package faruk;
import java.util.Scanner;
public class array3d {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][][]=new int [2][3][4];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int  j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<arr[i][j].length-1;k++);
				{
				System.out.println("enter the marks of school" +i+ "class" +j+ "students");
				int k=0;
				arr[i][j][k]=sc.nextInt();
				
				
			}
		}
		
	}
System.out.println("Array contents are...");
for(int i=0;i<=arr.length-1;i++)
{
	for(int  j=0;j<=arr[i].length-1;j++)
	{
		for(int k=0;k<arr[i][j].length-1;k++);
		{
			int k=0;
			System.out.println("Enter marks of school  "+i+"  Class  "+j+"  Student "+k);
		//System.out.println("enter the marks of school"+i+"class"+j+"students");
	
		arr[i][j][k]=sc.nextInt();
		}
		System.out.println(" ");
	}
	System.out.println("--------------");
}
}
}
	



