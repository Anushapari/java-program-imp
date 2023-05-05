

package ArrayProgram;

public class AdditionOfTwoArray {

	public static void main(String[] args) 
	{
		int[] a= {3,5,7,8,1,7,9};
		int[] b= {2,4,6,9,4};
	//	int length=a.length;
//		if(a.length<b.length)
//		{
//			length=b.length;
//		}
		for(int i=0;i<a.length;i++)
		{
			try {
		System.out.print(a[i]+b[i] +" ");
		}
			catch(Exception e) 
			{
				if(a.length<b.length)
				{
					System.out.print(b[i]+" ");
				}
				else
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		
	}

}
