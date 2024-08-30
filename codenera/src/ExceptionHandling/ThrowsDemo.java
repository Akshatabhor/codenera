package ExceptionHandling;

import java.io.IOException;

public class ThrowsDemo 
{
	public void disp() throws IOException
	{
		int a=10,b=0;
		if(b==0)
		{
			throw new IOException("Exception genreted.....");
		}
	}
	public static void main(String[] args) 
	{
		ThrowsDemo obj=new ThrowsDemo();
		try
		{
			obj.disp();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
