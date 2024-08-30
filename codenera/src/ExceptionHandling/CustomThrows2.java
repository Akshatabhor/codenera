/*Implement a method called calculateFactorial that takes 
 * an integer as a parameter and calculates its factorial.
 *  Handle the exception that may occur 
 * if the input number is negative or exceeds a predefined limit.*/

package ExceptionHandling;
class NegativeException extends Exception
{
	NegativeException(String msg)
	{
		super(msg);
	}
}
public class CustomThrows2 
{
	public void factorialcal() throws NegativeException
	{
		int n=-2;
		if(n<0 || n>20)
		{
			throw new NegativeException("negative input");
		}
		else
		{
			int fact=1;
			for(int i=n;i>=1;i--)
			{
				fact=fact*i;
			}
			System.out.println("factorial of "+n+":"+fact);
		}
	}
	public static void main(String[] args) 
	{
		CustomThrows2 obj=new CustomThrows2();
		try
		{
			obj.factorialcal();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
