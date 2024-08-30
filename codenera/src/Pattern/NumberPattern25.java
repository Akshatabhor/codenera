package Pattern;
/*   1
 *  22
 *  333
 * 4444
 * 55555*/
public class NumberPattern25 {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=0;k<5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}

}
