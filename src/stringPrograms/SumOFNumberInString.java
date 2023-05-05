package stringPrograms;

import java.util.Scanner;

public class SumOFNumberInString {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the String");
		String st = "asf45gfs67";
		char[] ch=st.toCharArray();
		int sum=0;
		int tsum=0;
		for(int i=0;i<st.length();i++)
		{
			//char ch=st.charAt(i);
			if(ch[i]>='1' && ch[i]<='9')
			{
				
			tsum=tsum*10+ch[i]-48;
			}
			else
			{
				sum=sum+tsum;
				tsum=0;
				
			}
		}
		sum=sum+tsum;
System.out.println("The number of digits is  " +sum);

	}

}