package ArrayProgram;

public class MinNumArraywithoutBBsort {

	public static void main(String[] args) 
	{
		int a[]= {2,89,56,45,32};
		for(int i=0;i<a.length;i++)
		{
			//minimum number
			//if(a[0]>a[i])
				//maximum number
				if(a[0]<a[i])
				
			{
				a[0]=a[i];
			}
		}
		
		System.out.println(a[0]);

	}

}
