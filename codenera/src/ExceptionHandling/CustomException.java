package ExceptionHandling;

class AgeValidateException extends Exception
{
	AgeValidateException(String msg)
	{
		super(msg);
	}
}
public class CustomException
{
	public void voting() throws AgeValidateException
	{
		int age=10;
		if(age<18)
		{
			throw new AgeValidateException("Age is not valid");
		}
		else
		{
			System.out.println("Age is  Valid:"+age);
		}
	}
	public static void main(String[] args)
	{
		CustomException obj=new CustomException();
		try
		{
			obj.voting();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
