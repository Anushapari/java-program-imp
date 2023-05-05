package AssignmentString;

public class ReverseEachWordINString {

	public static void main(String[] args) {
		String s="i am in ooty";
		String[] sa=s.split(" ");
		//String rev="";
		for(int i=0;i<sa.length;i++)
		{
			String str=sa[i];
			
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
	}

}
}
