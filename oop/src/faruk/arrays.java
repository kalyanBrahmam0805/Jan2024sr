package faruk;
import java.util.Scanner;
public class arrays {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int arr[][][]=new int [3][][];
		arr[0]=new int[3][];
		arr[1]=new int[2][];
		arr[2]=new int[4][];
		arr[0][0]=new int[3];
		arr[0][1]=new int[4];
		arr[0][2]=new int[2];	
		arr[1][0]=new int[4];
		arr[1][1]=new int[3];
		arr[2][0]=new int[2];
		arr[2][1]=new int[3];
		arr[2][2]=new int[1];
		arr[2][3]=new int[2];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++) {
					
				
				System.out.println("Enter the marks of School"+i+"class"+j+"students");

				arr[i][j][k]=Sc.nextInt();
				
				
		}
	
	}
}
	
	System.out.println("Array Contents are ");
	for(int i=0; i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			//int k=0;
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
			
			System.out.println(arr[i][j][k]+" ");
		}
		System.out.println("  ");
	}
	
}

	}

}
