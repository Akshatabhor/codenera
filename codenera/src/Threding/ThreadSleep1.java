package Threding;

public class ThreadSleep1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello Word!");
		
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}

	public static void main(String[] args)
	{
		ThreadSleep1 obj=new ThreadSleep1();
		obj.start();
	}

}
