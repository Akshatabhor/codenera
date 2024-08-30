package ExceptionHandling;

public class NestedTry1 {

	public static void main(String[] args) 
	{
		try
		{
			try
			{
				System.out.println("nested inner block 1");
				
				try
				{
					System.out.println("nested inner block 2");
					int a[]= {1,2,3,4,5};
					System.out.println(a[a.length]);
				}
				catch(ArithmeticException e)
				{
					System.out.println("inner try block 2:"+e);
				}
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println("inner try block 1:"+e1);
			}
		}
		catch(Exception e)
		{
			System.out.println("outer try block :"+e);
		}
	}

}
