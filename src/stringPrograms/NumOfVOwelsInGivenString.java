package stringPrograms;

public class NumOfVOwelsInGivenString {

	public static void main(String[] args) 
	{
		String s="anusha";
		char[] c=s.toCharArray();
		int count=0;
		
		for(int i=0;i<c.length;i++)
		{
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'
				||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
		{
			//System.out.println(c[i] +" is vowel");
			count++;
			System.out.print(c[i]);
		}
		else 
		{
			//System.out.println(c[i] +" is consonant");
		}

		

	}
		System.out.println("  the numbers of vowel is "+count);

}
}
