/*Q2.Write a Java program that simulates a bank account. Create a custom exception class called
  "InsufficientBalanceException" and raise it whenever a withdrawal is attempted with an amount
 higher than the account balance. Handle the custom exception and display an error message
*/

package ExceptionHandling;
class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
public class CustomThrows7 
{
	public void banckaccount() throws InsufficientBalanceException
	{
		double amt=0;
		double bal=0;
		if( amt >bal)
		{
			throw new InsufficientBalanceException("attempted with an amout higher");
		}
		else
		{
			System.out.println("not attempted with an amount higher");
		}
	}

	public static void main(String[] args) 
	{
		CustomThrows7 obj=new CustomThrows7();
		try
		{
			obj.banckaccount();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("main completed");
		}
	}

}
