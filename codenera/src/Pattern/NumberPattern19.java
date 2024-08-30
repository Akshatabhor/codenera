package Pattern;

public class NumberPattern19 {

	public static void main(String[] args)
	{
		for(int i=5-1;i>=0;i--)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i+1;j<=5;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();

		}
	}

}
