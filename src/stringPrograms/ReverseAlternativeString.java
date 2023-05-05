package stringPrograms;

public class ReverseAlternativeString {

	public static void main(String[] args) {
		String st="hi java hi phython";
		String[] s=st.split(" ");
		
		for(int i=0;i<4;i++)
		{
			if(i%2==0)
			{
				System.out.print(s[i]+" ");
			}
			else
			{
				String str=s[i];
				
				for(int j=str.length()-1;j>=0;j--)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print(" ");
		}
		
		

	}

	}
}
