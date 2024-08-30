/* Write a Java program to create a method that
 
 * takes an integer as a parameter and throws an exception if the
 *  number is odd.*/

package ExceptionHandling;
class oddnoException extends Exception
{
	oddnoException(String msg)
	{
		super(msg);
	}
}
public class CustomThrows3
{

	public void oddnumber() throws oddnoException
	{
		int n=11;
		if(n%2!=0)
		{
			throw new oddnoException("the no is odd:"+n);
		}
		else
		{
			System.out.println("the no is even:"+n);
		}
	}
	public static void main(String[] args) 
	{
		CustomThrows3 obj=new CustomThrows3();
		try
		{
			obj.oddnumber();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
