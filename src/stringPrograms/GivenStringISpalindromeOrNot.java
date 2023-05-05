package stringPrograms;

public class GivenStringISpalindromeOrNot {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		char[] c=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			//rev=rev+s.charAt(i);
			rev=rev+c[i];
		}
		if(rev.equals(s))
		{
			System.out.println("the given string is palindrome");
		}
		else
		{
			System.out.println("the given string is not palindrome");
		}

	}

}
