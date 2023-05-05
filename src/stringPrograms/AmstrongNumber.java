package stringPrograms;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num=34;
		int t1=num;
		int lenght=0;
		while(t1>0)
		{
			lenght=lenght+1;
			t1=t1/10;	
		}
		System.out.println(lenght);
		int t2=num;
		int rem=0;
		
		int sum=0;
		while(t2>0)
		{
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=lenght;i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			t2=t2/10;
		}
		if(sum==num)
		{
			System.out.println("amstrong number");
		}
		else
		{
			System.out.println("not amstrong number");
		}
		

	}

}
