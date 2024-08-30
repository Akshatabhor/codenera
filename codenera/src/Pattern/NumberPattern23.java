package Pattern;
/*11111
 *11122
 *11333
 *14444
 *55555*/
public class NumberPattern23 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<5-1)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}

}
