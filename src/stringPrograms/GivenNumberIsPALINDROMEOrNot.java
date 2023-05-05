package stringPrograms;

public class GivenNumberIsPALINDROMEOrNot {

	public static void main(String[] args) 
	{
		int num=121;
		int rev=0;
		int s=num;
		while(num>0)
		{
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		
if(rev==s)
{
	System.out.println("given number is palindrome");
}
else
{
	System.out.println("given number is not palindrome");
}
	}

}
