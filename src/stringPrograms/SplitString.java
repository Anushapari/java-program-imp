package stringPrograms;

public class SplitString {

	public static void main(String[] args) {
	String st="amount has paid rs in 10.50";
	char[] s=st.toCharArray();
	//System.out.println(s[5]);
	for(int i=0;i<s.length;i++)
	{
	if(s[i]>='0' && s[i]<='9'||s[i]=='.')
	{
		System.out.print(s[i]);
	}
		


	}
	}
}
