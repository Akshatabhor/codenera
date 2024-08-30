package Threding;

public class DeadLock
{

	public static void main(String[] args) throws InterruptedException
	{
		String str1="hello";
		String str2="java";
		
		Thread t1=new Thread()
				{
					public void run()
					{
						System.out.println("Thread 1...");
						synchronized(str1)
						{
							System.out.println("Thread 1 acquires lock object str1");
							try
							{
								System.out.println("waiting str2");
								Thread.sleep(10000);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
							synchronized(str2)
							{
								System.out.println("Thread 1 acquires lock object str2");
							}
						}
					}
				};
				Thread t2=new Thread()
				{
					public void run()
					{
						System.out.println("Thread 2...");
						synchronized(str2)
						{
							System.out.println("Thread 2 acquires lock object str2");
							try
							{
								System.out.println("waiting str1");
								Thread.sleep(10000);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
							synchronized(str1)
							{
								System.out.println("Thread 2 acquires lock object str1");
							}
						}
					}
				};
				t1.start();
				t1.join();
				t2.start();
				t2.join();
}
}
