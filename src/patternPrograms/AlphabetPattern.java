package patternPrograms;

public class AlphabetPattern {

	public static void main(String[] args) 
	{
		int n=5;
		char m='a';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		//System.out.println();

	}

}
