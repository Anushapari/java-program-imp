package patternPrograms;

public class PyramidStringPattern1 {

	public static void main(String[] args) {
		String s="anusha";
		char[] c=s.toCharArray();
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(c[k]+" ");
			}
			System.out.println();
		}

	}

}
