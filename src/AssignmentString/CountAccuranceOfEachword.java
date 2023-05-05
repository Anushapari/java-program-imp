package AssignmentString;

import java.util.LinkedHashSet;

public class CountAccuranceOfEachword
{

	public static void main(String[] args) 
	{
		String st="i i am from from am testyantra";
		String[] s = st.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		for(String sen:set)
		{
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(sen))
			{
				
				count++;
			}
			}
			
				System.out.println(sen +" count is " +count);
	}
}
}
