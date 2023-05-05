package ArrayProgram;

import java.util.LinkedHashSet;

public class CountDuplicatesInArray {

	public static void main(String[] args)
	{
		int[] a= {1,4,5,1,4,4,3};
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
			
		}
		for(Integer inte:set)
		{
			//System.out.println(inte);
			
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(inte==a[i])
				{
					count++;
				}
			}
				if(count>1)
				{
					
					System.out.println(inte+"repeats"+count+"times");
					
				}
				
				
			
		}
		
		

	}

}
