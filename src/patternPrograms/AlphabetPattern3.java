package patternPrograms;

public class AlphabetPattern3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print((char)(64+i));
			}
			System.out.println();
		}

	}

}
