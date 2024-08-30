package Pattern;
/*A B C D E
 *A B C D
 *A B C
 *A B
 *A
 *A B
 *A B C
 *A B C D
 *A B C D E*/
public class CharPattern30 {

	public static void main(String[] args)
	{
		for(int i=5;i>0;i--)
		{
			char startchar='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(startchar+" ");
				startchar++;
			}
			System.out.println();
		}
		for(int i=1;i<5;i++)
		{
			char startchar='A';

			for(int j=0;j<=i;j++)
			{
				System.out.print(startchar+" ");
				startchar++;
			}
			System.out.println();
		}
	}

}
