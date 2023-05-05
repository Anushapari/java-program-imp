package stringPrograms;

public class ReverseString 
{ 
	public static void main(String[] args)
	{
//	String s="welcome to to bangalore bangalore";
//	String[] st=s.split(" ");
//	for (int i=st.length-1;i>=0;i--)
//	{
//		System.out.print(st[i]+"  ");
//	}


//type 2
String s="welcome to to bangalore bangalore";
String[] st=s.split(" ");
String rev="";

for (int i=st.length-1;i>=0;i--)
{
	rev=rev+st[i]+"   ";
	
}
System.out.print(rev );
	}
	}