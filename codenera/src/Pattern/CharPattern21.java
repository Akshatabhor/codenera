package Pattern;
/*A
 *B C
 *D E F
 *G H I J
 *K L M N O*/
public class CharPattern21 {

	public static void main(String[] args) 
	{
		char startchar='A';
		for(int i=0;i<5;i++)
		{
			char currentchar=startchar;
			for(int j=5;j<=5+i;j++)
			{
				System.out.print(startchar+" ");
				startchar++;
			}
			System.out.println();
		}
	}

}
