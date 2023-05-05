package stringPrograms;

public class ReplaceDotWithSpace {

	public static void main(String[] args) {
		String s="update.decline.accept.include";
		char[] a=s.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='.')
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[i]);
			}
			if(a[i]=='c')
			{
				count++;
			}
			
		}
		System.out.println();
		System.out.println("c repeats "+count+" times");

	}

}
