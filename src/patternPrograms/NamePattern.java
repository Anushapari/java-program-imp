package patternPrograms;

public class NamePattern {

	public static void main(String[] args) {
		String s="anusha";
		char[] c=s.toCharArray();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i]+"  ");
			}
			System.out.println();
		}
		for(int i=3;i<=c.length;i++)
		{
			for(int j=3;j<=c.length;j--)
			{
				System.out.print(c[i]+"  ");
			}
			System.out.println();
		}


	}

}
