package Pattern;

public class CharPattern25 {

	public static void main(String[] args) 
	{
		for(int i=1;i<5;i++)
		{
			char startChar='A';

			for(int j=1;j<=i;j++)
			{
				System.out.print(startChar+" ");
				startChar++;
			}
			System.out.println();
		}
		for(int i=5;i>=0;i--)
		{
			char startChar='A';

			for(int j=1;j<=i;j++)
			{
				System.out.print(startChar+" ");
				startChar++;
			}
			System.out.println();
		}
	}

}
