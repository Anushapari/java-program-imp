package stringPrograms;

public class REverseStringwithoutUsingForLoop 
{
	public static void reverse(char[] c,int length)
{
	if(length>0)
	{
		System.out.print(c[length-1]);
		length--;
		reverse(c,length);
	}
}
	public static void main(String[] args) {
		String s="anusha";
		char[] c=s.toCharArray();
		int length=c.length;
		reverse(c,length);

	}

}
