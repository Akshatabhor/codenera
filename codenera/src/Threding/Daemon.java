package Threding;

public class Daemon extends Thread
{
	public void run()
	{
		System.out.println("Running....");
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("it is a Daemon Thread");
		}
		else
		{
			System.out.println("it is not Daemon Thread");

		}
		
	}
	public static void main(String[] args) 
	{
		//Thread.currentThread().setDaemon(true);//we cannot declare in main method becuase it already started
		System.out.println("main Started....");
		Daemon t1=new Daemon();
		t1.setDaemon(true);
		t1.start();//we cannot start first for daemon
	}

}
