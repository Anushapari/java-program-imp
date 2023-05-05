package AssignmentString;

public class PositionOfEachWordWithDuplicate {

	public static void main(String[] args) 
	{
		String st="i am from from am testyantra";
		String[] s=st.split(" ");
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i] +" is in position "+(i+1));
		}
	

	}

}
