/*Q3 Write a Java program that calculates the area of a rectangle. 
 The program should take the length and width of the rectangle as input from the user. If either the length
  or width entered by the user is negative, throw a custom exception called NegativeDimensionException. 
 The NegativeDimensionException should be a checked exception that includes an appropriate error message.
*/

package ExceptionHandling;
import java.util.Scanner;
class NegativeDimensionException extends Exception
{
	NegativeDimensionException(String msg)
	{
		super(msg);
	}
}
public class CustomThrows10 
{
	public int calarea(int l, int w ) throws NegativeDimensionException
	{
		if(l<0 || w<0)
		{
			throw new NegativeDimensionException("length or width is negative");
		}
		return l*w;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of rectangle");
		int l=sc.nextInt();
		System.out.println("enter the weight of rectangle");
		int w=sc.nextInt();
		CustomThrows10 obj=new CustomThrows10();
		
		try
		{
			int area=obj.calarea(l, w);
			System.out.println(area);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
