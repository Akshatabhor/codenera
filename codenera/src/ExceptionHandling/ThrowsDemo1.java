package ExceptionHandling;

import java.io.IOException;

public class ThrowsDemo1 
{
	void m1() throws IOException
	{
		throw new IOException("System error....");
	}
	void m2()  throws IOException
	{
		m1();
	}
	void m3()  throws IOException
	{
		m2();
	}

	public static void main(String[] args)
	{
		ThrowsDemo1 obj=new ThrowsDemo1();
		try
		{
			obj.m3();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
