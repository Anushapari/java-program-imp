package stringPrograms;

import java.util.Scanner;

public class SumOfDigitsInString {

	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String");
//		String st = sc.next();
//		int sum=0;
//		for(int i=0;i<st.length();i++)
//		{
//			char ch=st.charAt(i);
//			if(ch>='1' && ch<='9')
//			{
//			sum=sum+ch-48;
//			}
//		}
//System.out.println("The number of digits is  " +sum);
//	}
//
//}
{
		String s="12345";
		char[] c=s.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' &&c[i]<='9')
			{
				sum=sum+c[i]-48;
			}
		}
		System.out.println(sum);
}
}