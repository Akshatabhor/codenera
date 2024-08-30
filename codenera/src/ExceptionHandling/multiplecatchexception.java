package ExceptionHandling;

public class multiplecatchexception {

	public static void main(String[] args) 
	{
		try
		{
			String s1="java";
			int a1=Integer.parseInt(s1);
			String str=null;
			System.out.println(str.length());
			int a[]= {1,2,3,4,5};
			for(int i=0;i<=5;i++)
			System.out.println(a[i]);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("exception occur:"+e);
		}
		catch(NullPointerException e)
		{
			System.out.println("exception occur:"+e);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("exception occuer:"+e1);
		}
		catch(Exception e2)
		{
			System.out.println("parent exception:"+e2);
		}
		finally
		{
			System.out.println("final block executed");
		}
	}

}
