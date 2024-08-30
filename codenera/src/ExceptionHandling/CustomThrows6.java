
/*Q1. WAP to create the custome exception to throw the messgae if user is not eligible
  for blood donation, message will be you're not eligible for blood donation.*/

package ExceptionHandling;
class NotEligibleException extends Exception
{
	NotEligibleException(String msg)
	{
		super(msg);
	}
}
public class CustomThrows6 
{
	public void blood() throws NotEligibleException
	{
		int age=0;
		
		if( age<18 || age>65)
		{
			throw new NotEligibleException("age between 18 to 65");
		}
		
	}

	public static void main(String[] args) 
	{
		CustomThrows6 obj=new CustomThrows6();
		try
		{
			obj.blood();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("main completedwqw");
		}
	}

}
