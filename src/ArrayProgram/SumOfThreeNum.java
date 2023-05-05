 package ArrayProgram;

public class SumOfThreeNum {

	public static void main(String[] args) 
	{
		int	a[]= {1,8,1,67,45,20};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				//for minimum number
				//	if(a[i]>a[j]) 
						//for maximum number
						if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

	}
int sum=0;
int count=3;
long mul=1;
for(int k=0;k<count;k++)
{
	sum=sum+a[k];

	mul=mul*a[k];
}
System.out.println(sum);
System.out.println(mul);
	}
}
