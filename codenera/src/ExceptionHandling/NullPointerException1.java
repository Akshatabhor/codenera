package ExceptionHandling;

public class NullPointerException1
{

	public static void main(String[] args) 
	{
		try
		{
			String str=null;
			System.out.println(str.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception occur:"+e);
		}
		finally
		{
			System.out.println("final block executed");
		}
	}

}
