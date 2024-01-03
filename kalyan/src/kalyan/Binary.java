package kalyan;
import java.util.*;
public class Binary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		//System.out.println("Enter the array size: ");
		int arr[]=new int[sc.nextInt()];
		//System.out.println("Enter the elements into array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//System.out.println("enter the key element to search");
		int key=sc.nextInt();
		
         BinaryApp.binary(arr, key);  
	}
}

