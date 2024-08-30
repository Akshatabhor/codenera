package ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/1);
			System.out.println(20/2);
			System.out.println(30/3);
			System.out.println(40/4);
			System.out.println(50/5);
			System.out.println(60/5);
			System.out.println(70/0);
			System.out.println(80/8);
			System.out.println(90/9);
			System.out.println(100/1);
		}
		
		catch(Exception e)
		{
			System.out.println("exception occur:"+e);
		}
		finally
		{
			System.out.println("final block execute:");
		}
	}

}
