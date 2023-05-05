package ArrayProgram;

public class AdditionOfPreviousAndNext {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int sum=0;
		for(int i=1;i<a.length;i++)
		{
			a[i]=a[i-1]+a[i+1];
			System.out.println(a[i]+" ");
		}
	}

}
