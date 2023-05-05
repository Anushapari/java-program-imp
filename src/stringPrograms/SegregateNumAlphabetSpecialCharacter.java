			package stringPrograms;

public class SegregateNumAlphabetSpecialCharacter {

	public static void main(String[] args) {
		String s="art73nu1214*FDH&%$";
		char[] c=s.toCharArray();
		String alpha="";
		String spec="";
		String num="";
		for(int i=0;i<c.length;i++)
		{
		if(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z')
		{
		alpha=alpha+c[i];
		}
		
		else if (c[i]>='1'&&c[i]<='9') 
		{
			num=num+c[i];
		}
		else
		{
			spec=spec+c[i];
		}
			
		}
System.out.println(alpha +" "+num+" "+spec);
	}

}
