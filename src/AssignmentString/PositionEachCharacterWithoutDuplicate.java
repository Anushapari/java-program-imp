package AssignmentString;

import java.util.LinkedHashSet;

public class PositionEachCharacterWithoutDuplicate {

	public static void main(String[] args)
	{
		int i;
		String s="testyantra";
		char c[]=s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for( i=0;i<c.length;i++)
		{
			set.add(c[i]);
		System.out.println(set);
		}
//		for(Character ch:set)
//		{
//			for( i=0;i<c.length;i++)
//			{
//				if(ch==c[i])
//				{
//					System.out.println(c[i]+" is in position  "+(i+1));
//					break;
//		
//		
//		}
//	}
//		}
	}
}


