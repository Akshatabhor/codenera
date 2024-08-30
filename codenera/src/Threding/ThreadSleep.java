package Threding;

public class ThreadSleep extends Thread

{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				System.out.println();
 	}
		
	}
			
	public static void main(String[] args) 
	{
		ThreadSleep obj=new ThreadSleep();
		obj.start();
	}

}
