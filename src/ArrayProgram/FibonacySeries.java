package ArrayProgram;

public class FibonacySeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<10;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			
//			
//				if(c%3==0 || c%5==0)
//				{
//					System.out.print(c+" ");
//				}
//			
			a=b;
			b=c;
			
			
			
		}

	}

}
