package ArrayProgram;
public class ShortArrayBubblesort {

	public static void main(String[] args) 
	{
	int	a[]= {1,8,67,45,20};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++) 
		{
			//assending order
			//if(a[i]>a[j]) 
				//decending order
				if(a[i]<a[j]) 
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(a[i]);
	}
		
	
	}

}
