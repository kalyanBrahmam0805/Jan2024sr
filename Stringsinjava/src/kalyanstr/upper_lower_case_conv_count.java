package kalyanstr;
import java.util.Scanner;
public class upper_lower_case_conv_count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int ucount=0;
		int lcount=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
//			int ch=s1.charAt(i);
//			if(ch>=97 && ch<=122)
//			{
//				lcount++;
//				
//			}
//			else
//			{
//				ucount++;
//			}
			if(Character.isLowerCase(s1.charAt(i)))
		{
				lcount++;
		}
		else
		{
			ucount++;
		}

		
	}
		System.out.println("The lower character count is:"+lcount);
		System.out.println("The upper character count is :"+ucount);

		
		
		
		
		
		
		
}
}