package Pattern;
/*1
 *2 2
 *3 3 3
 *4 4 4 4
 *5 5 5 5 5
 *6 6 6 6
 *7 7 7
 *8 8 
 *9
 **/
public class NumberPattern45 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		int start=6;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4-i;j++)
			{
				System.out.print(start+i+" ");
			}
			System.out.println();
		}
	}

}
