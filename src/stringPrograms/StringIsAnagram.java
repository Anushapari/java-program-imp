package stringPrograms;

import java.util.Arrays;

public class StringIsAnagram {

	public static void main(String[] args) {
		String s="anusha";
		String a="ahsuan";
		char[] st=s.toCharArray();
		char[] at=s.toCharArray();
		int sl=s.length();
		int al=s.length();
		Arrays.sort(st);
		Arrays.sort(at);
		if(al==sl)
		{
			boolean eqe=Arrays.equals(st, at);
			if(eqe)
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
			}}
		else {
			System.out.println("no");
		}

	}

}
