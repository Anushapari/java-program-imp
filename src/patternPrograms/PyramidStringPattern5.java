package patternPrograms;

public class PyramidStringPattern5 {

	public static void main(String[] args) {
		String s="anusha";
		char[] c=s.toCharArray();
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(c[j]);
			}
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=3;j<=5-i;j++)
			{
				System.out.print(c[j]);
			}
			System.out.println();
		}
	}

}
