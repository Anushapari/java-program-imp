package stringPrograms;

public class CountAlphabet {

	public static void main(String[] args) {
		String s="aaabbbbcddaaacc";
		char[] c=s.toCharArray();
		int count=1;
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==(c[j]))
				{
					count++;
				}
			}
			System.out.print(c[i]+count+" ");
		}
				
			
			count=1;
				}
			}
		

	


