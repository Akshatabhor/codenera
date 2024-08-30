package ExceptionHandling;

public class ArrayIndexOutOffBound {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("exception occur"+e);
		}
		finally
		{
			System.out.println("final block exacuted");
		}
	}

}
