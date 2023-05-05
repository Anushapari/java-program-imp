package stringPrograms;

import java.util.LinkedHashSet;

public class OccuranceOfEachWordInString {

	public static void main(String[] args) {
		String st="welcome to city welcome to bangalore";
		String[] s=st.split(" ");
		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
			
		}
		for(String inte:set)
		{
			//System.out.println(inte);
			int count=0;
			for(int i=0;i<s.length;i++)
			{
				if(inte.equals(s[i]))
				{
					count++;
				}
			}
			System.out.println(inte+" = "+count);
		}
		

	}

}
