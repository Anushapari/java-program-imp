package ArrayProgram;

public class AdditionofDiagonalElementsinarray {

	public static void main(String[] args) {
		int[][] a= {{1,2,5},{3,5,6},{7,8,9}};
		int sum=0;
		int sum2=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
				if(i+j==2)
				{
					sum2=sum2+a[i][j];
				}
			}
		}
		
		System.out.println(sum);
		System.out.println(sum2);

	}

}
