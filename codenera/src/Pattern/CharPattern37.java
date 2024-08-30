package Pattern;
/*AAAAA
 *AAABB
 *AACCC
 *ADDDD
 *EEEEE*/
public class CharPattern37 {

	public static void main(String[] args) 
	{

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j<5-i-1)
				{
					System.out.print('A');
				}
				else
				{
					System.out.print((char) ('A' + i));
				}
			}
			System.out.println();
		}
	}

}
