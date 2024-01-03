package Arrayprograms;
import java.util.Scanner;
public class searcheleinarr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<=arr.length-1;i++)
        {
        	arr[i]=sc.nextInt();
        }
        
        int key=sc.nextInt();
        for(int i=0;i<=arr.length-1;i++ )
        {
        	
			if(arr[i]==key) 
			{
			System.out.println(i);
			System.exit(0);
			}
			
        }
		System.out.println("element not found");
			
				
        
      
        
	}

}
