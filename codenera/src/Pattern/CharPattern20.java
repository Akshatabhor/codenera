package Pattern;
/*E
 *E D
 *E D C
 *E D C B
 *E D C B A*/
public class CharPattern20 {

	public static void main(String[] args) 
	{
		char startchar='E';
		for(int i=1;i<=5;i++)
		{
			char currentchar=startchar;
			for(int j=5;j<5+i;j++)
			{
				System.out.print(currentchar+" ");
				currentchar--;
			}
			System.out.println();
		}
	}

}
