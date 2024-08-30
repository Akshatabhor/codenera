package Pattern;
/* E D C B A
 * E D C B
 * E D C
 * E D
 * E  */
public class CharPattern19 {

	public static void main(String[] args) 
	{
		{
			char startchar='E';
			for(int i=0;i<5;i++)
			{
				char currentchar=startchar;
				for(int j=0;j<5-i;j++)
				{
					System.out.print(currentchar+" ");
					currentchar--;
				}
				System.out.println();
			}
		}
	}

}
