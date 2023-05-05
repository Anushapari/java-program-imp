package AssignmentString;

import java.util.LinkedHashSet;

public class CountDuplicateCharInString {

	public static void main(String[] args) 
	{
		String s="testyantra";
		char[] c=s.toCharArray();
	LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<c.length;i++)
		{
			set.add(c[i]);
			
		}
		for(Character inte:set)
		{
			//System.out.println(inte);
			
			int count=0;
			for(int i=0;i<c.length;i++)
			{
				if(inte.equals(c[i]))
				{
					count++;
				}
			}
				if(count>1)
				{
					
					System.out.println(inte+"  repeats "+count+" times");
					
				}
				

	}

}
}
