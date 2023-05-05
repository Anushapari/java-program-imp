package patternPrograms;

public class PyramidStringPattern {

	public static void main(String[] args) {
		String s="anusha";
		char[] c=s.toCharArray();
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++)
			{
				System.out.print(c[k]);
			}
			System.out.println();
		}

	}

}
