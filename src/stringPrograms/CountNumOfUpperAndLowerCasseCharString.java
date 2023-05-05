package stringPrograms;

public class CountNumOfUpperAndLowerCasseCharString {

	public static void main(String[] args) 
	{
		String st="TeStYanTrAANUsHA";
		char[] c=st.toCharArray();
		int lowercase=0;
		int uppercase=0;
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a'&&c[i]<='z')
			{
				lowercase++;
			}
			else if(c[i]>='A'&&c[i]<='Z')
			{
				uppercase++;
			}
		}
		
System.out.println(lowercase);
System.out.println(uppercase);
	}

}
