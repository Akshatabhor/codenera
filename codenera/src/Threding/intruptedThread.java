package Threding;

public class intruptedThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				System.out.println(i);
				Thread.currentThread().sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
	}
	public static void main(String[] args)
	{
		intruptedThread t1=new intruptedThread();
		t1.start();
		t1.interrupt();
	}

}
