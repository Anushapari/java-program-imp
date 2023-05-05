package AssignmentString;

import java.util.LinkedHashSet;

public class CountTheOccuranceOfEachChar {

	public static void main(String[] args) 
	{
		String s="wwwwprreetrt";
		char c[]=s.toCharArray(); 
//		int count=0;
//		for(int i=0;i<c.length-1;i++)
//		{
//			if(c[i]==c[i+1])
//			{
//				count++;
//			}
//			System.out.println(c[i]+"occurs"+count);
//		}
		//System.out.println(c[i]+count);
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<c.length;i++)
		{
			set.add(c[i]);
			
		}
		for(Character inte:set)
		{
			//System.out.println(inte);
			int count=0;
			for(int i=0;i<c.length-1;i++)
			{
				if(inte==c[i])
				{
					count++;
				}
			}
			System.out.print(inte+" = "+count);
		}
		
		

	}

}
