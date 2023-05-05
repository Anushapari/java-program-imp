package AssignmentString;

import java.util.LinkedHashSet;

public class PositionOfEachWordWithoutDuplicate {

	public static void main(String[] args) {
		String st="I am from from am testyantra";
		String[] s=st.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		//int i;
		for(  int i=0;i<s.length;i++)
		{
			set.add(s[i]);
			System.out.println(set +" is in position " +(i+1));
		}
		//System.out.println(set +" is in position " +(i+1));

	}

}

