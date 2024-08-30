package String;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args)
	{
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter String :");
				StringBuffer str = new StringBuffer(sc.next());
				int X =0,Y =2;
				for(int i = 0;i < str.length();i++)
				{
					int c = 1;
					for(int j = i+1;j < str.length();j++)
					{
						if(str.charAt(i) == str.charAt(j))
						{
							c++;
							str.deleteCharAt(j);
						}
					}
					if(str.charAt(i)%2 == 0 && c%2 == 0)
					{
						X++;
					}
					else
					{
						Y++;
					}
				}
				if((X+Y)%2 == 0)
				{
					System.out.println("Even");
				}
				else
				{
					System.out.println("ODD");
				}

			}

		
	}


