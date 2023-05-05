package stringPrograms;

public class ReplaceAlphaetewithstar {

	public static void main(String[] args) {
		String s="abc123hjdg456";
		char[] c=s.toCharArray();
		for (int i=0;i<c.length;i++)
		{
			if(c[i]>='a'&&c[i]<='z')
			{
				System.out.print("*");
				
			}
			else if(c[i]>='1'&&c[i]<='9')
			{
				System.out.print(c[i]);
			}
		}

	}

}
