/*Write a Java program that throws a custom
 
 * exception when the sum of two integers exceeds a certain threshold. 
 * The program should accept two integers as input and throw a 
 * ThresholdExceededException if their sum is greater than 100. Handle
 *  the exception and display an appropriate error message.*/
package ExceptionHandling;

class ThresholdExceededException extends Exception
{
	ThresholdExceededException(String msg)
	{
		super(msg);
	}
}
public class CustomThrows 
{
	public void sum() throws ThresholdExceededException
	{
		int a=50;
		int b=60;
		int sum=a+b;
		if(sum>100)
		{
			throw new ThresholdExceededException("sum of integer is greater than 100:"+sum);
		}
		else
		{
			System.out.println("sum of integer is less than 100:"+sum);
		}
	}

	public static void main(String[] args)
	{
		CustomThrows obj=new CustomThrows();
		try
		{
			obj.sum();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
