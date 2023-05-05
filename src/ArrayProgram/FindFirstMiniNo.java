package ArrayProgram;

public class FindFirstMiniNo {

	public static void main(String[] args)
	{
		int	a[]= {0,1,8,67,45,20};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				
					if(a[i]>a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.println(a[i]);

}
	//minimum number	
System.out.println("the first minimum number is "+a[0]);
//highest number
System.out.println("the highest number is "+a[4]);
//System.out.println(a[a.length-1]);
//first three minimum number

	
	for(int k=0;k<3;k++)
	{
		System.out.println(a[k]);
	}
}
}