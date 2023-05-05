package collectionProgram;

import java.util.HashMap;

public class OccuranceOfEachCharacterInStringUsingHashMap {

	public static void main(String[] args) {
		String s="anusha";
		HashMap h=new HashMap();
		for(int i=0;i<s.length();i++)
		{
			h.put(s.charAt(i),null);
		}
		for(Object ii:h.keySet())
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ii.getkey()==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ii.getkey()+" "+count);
		}

	}

}
