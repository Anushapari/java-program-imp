package AssignmentString;

import java.util.LinkedHashSet;

public class PracticeJ {

	public static void main(String[] args) {
		String s="anusha hi anu hello anusha";
		String[] c=s.split(" ");
		//LinkedHashSet<String> set=new LinkedHashSet<Character>();
		for(int i=0;i<c.length;i++)
		{
		String ss=c[i];
		for(int j=ss.length()-1;j>=0;j--)
		{
		System.out.print(ss.charAt(j));
		}
		System.out.print(" ");
		}



		}
		}



