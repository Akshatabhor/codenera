package Pattern;
/* E D C B A
 * D C B A
 * C B A
 * B A
 * A
 * B A
 * C B A
 * D C B A
 * E D C B A
 * */
public class CharPattern31 {

	public static void main(String[] args) 
	{
		
		        int rows = 5;

		        for (int i = 0; i < rows; i++)
		        {
		            char character = (char) ('E' - i); 
		            for (int j = 0; j < rows - i; j++)
		            {
		                System.out.print((char) (character - j) + " ");
		            }
		            System.out.println();
		        }
		    
		

			for(int i=1;i<5;i++)
			{
				 char character = (char) ('A' + i);
				for(int j=0;j<=i;j++)
				{
					System.out.print(character+" ");
					character--;
				}
				System.out.println();
			}
			
		}
	}


