package patternPrograms;

public class NumberPattern {

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i*2;k++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
