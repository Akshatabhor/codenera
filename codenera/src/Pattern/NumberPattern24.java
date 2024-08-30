package Pattern;
/*123454321
 *2345432
 *34543
 *454
 *5*/
public class NumberPattern24 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			for(int j=5-1;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
