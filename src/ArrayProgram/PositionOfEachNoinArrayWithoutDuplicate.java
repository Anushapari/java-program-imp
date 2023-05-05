package ArrayProgram;

import java.util.LinkedHashSet;

public class PositionOfEachNoinArrayWithoutDuplicate {

	public static void main(String[] args) 
	{
		int[] a= {1,5,2,1,5,9,7};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer in:set)
		{
			for(int i=0;i<a.length;i++)
			{
				if(in==a[i])
				{
					System.out.println(a[i]+"is in"+(i+1));
					break;
				}
			}
		}
		

	}

}
