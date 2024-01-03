package kalyan;
import java.util.*;
public class Demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[sc.nextInt()];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int key=sc.nextInt();
	binary(arr,key);
}
public static void binary(int arr[],int key)
{
	int low=0;
	int high=arr.length-1;
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(arr[mid]==key)
		{
			System.out.println("key found");
			return;
		}
		else if(key>arr[mid])
		{
			low=mid+1;
		}
		else
		{
			high=mid-1;
		}
	}
	System.out.println("key not found");
}
}
