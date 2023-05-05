package ArrayProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) 
	{
		int[] a= {2,1,8,2,1,7,9};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
			//System.out.println(set);
		}
		System.out.println(set);
	}

}
