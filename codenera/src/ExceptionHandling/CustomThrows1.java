/*Write a Java program that creates a 

 * custom exception class called NegativeInputException. 
 * The program should accept an integer as input and throw a 
 * NegativeInputException if the input is negative. 
 * Handle the exception and display a 
 * custom error message indicating the negative input.*/


package ExceptionHandling;

class NegativeInputException extends Exception
{
	NegativeInputException(String msg)
	{
		super(msg);
	}
}
public class CustomThrows1
{
	public void negative() throws NegativeInputException
	{
		int n1=-1;
		if(n1<0)
		{
			throw new NegativeInputException("integer no is negative:");
		}
		else
		{
			System.out.println("interger no is positive");
		}
	}
	public static void main(String[] args) 
	{
		CustomThrows1 obj=new CustomThrows1();
		try
		{
			obj.negative();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
