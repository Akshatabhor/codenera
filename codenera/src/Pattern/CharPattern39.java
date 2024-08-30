package Pattern;

public class CharPattern39 {

	public static void main(String[] args)
	{
		for(int i=1;i<5;i++)
		{
			for(int k=0;k<5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print((char)('A'+j)+" ");
			}
			
			
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int k=0;k<5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print((char)('A'+j)+" ");
			}
			
			
			System.out.println();
		}
	}

}
