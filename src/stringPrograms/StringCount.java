package stringPrograms;

import java.util.LinkedHashSet;

public class StringCount {

	public static void main(String[] args) {
		String a="aaabbccc";
		char[] c=a.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<c.length;i++)
		{
			set.add(c[i]);
		}
		for(Character cc:set)
		{
			int count=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[j]==cc)
				{
					count++;
				}
			}
			System.out.print(cc+""  +count);
		}

	}

}
