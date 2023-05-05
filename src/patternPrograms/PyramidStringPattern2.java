package patternPrograms;

public class PyramidStringPattern2 {

	public static void main(String[] args) {
		String s="anusha";
		char[] c=s.toCharArray();
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(c[j]);
			}
			System.out.println();
		}

	}

}
