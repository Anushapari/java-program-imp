package stringPrograms;

import java.util.LinkedHashSet;

public class CountNoOfVowelWithoutDuplicate {

	public static void main(String[] args) {
		String s="anushaksioue";
		char[] cc=s.toCharArray();
		int count=0;
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<cc.length;i++)
		{
			set.add(cc[i]);
		}
		for(Character c:set)
		{
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
				||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			
			count++;
			System.out.print(c);
		}
		
	}
		System.out.println("  the numbers of vowel is "+count);


	}

}
