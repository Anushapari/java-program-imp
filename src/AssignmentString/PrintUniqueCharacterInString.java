package AssignmentString;

import java.util.LinkedHashSet;

public class PrintUniqueCharacterInString {

	public static void main(String[] args) 
	{
		String s="testyantra";
		char c[]=s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<c.length;i++)
		{
			set.add(c[i]);
		//System.out.println(set);
		}
		System.out.println(set);
	}

}
