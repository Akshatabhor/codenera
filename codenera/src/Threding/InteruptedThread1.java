package Threding;

public class InteruptedThread1 extends Thread
{
	public void run()
	{
		//System.out.println(Thread.currentThread().interrupted());//its is check and change

		System.out.println(Thread.currentThread().isInterrupted());//only check
		System.out.println(Thread.currentThread().isInterrupted());

		System.out.println(Thread.currentThread().interrupted());
		System.out.println(Thread.currentThread().interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.currentThread().interrupted());
		try
		{
			Thread.currentThread().sleep(1000);
			System.out.println("running");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		InteruptedThread1 t1=new InteruptedThread1();
		t1.start();
		t1.interrupt();
	}

}
