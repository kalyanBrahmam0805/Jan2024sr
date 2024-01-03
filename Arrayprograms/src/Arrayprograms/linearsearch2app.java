package Arrayprograms;

public class linearsearch2app {
public static int search(int arr[],int target) {
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]==target)
		{
			return target;
		}
		
	}
	return 0;
}
}
