package patternPrograms;

public class StarPattern3 {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" " );
			}
			for(int k=1;k<=2*i-1;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	for(int i=0;i<=5;i++)
	{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" " );
			}
		for(int k=5;k>=2*i-1;k--) 
		{
				System.out.print("*");

		}
			System.out.println();
		}
		

	}

}