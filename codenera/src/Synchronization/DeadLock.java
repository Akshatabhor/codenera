package Synchronization;
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
						synchronized(str1)
						{
							System.out.println("thread 1 acquires resourse 1");
							try
							{
								System.out.println("waiting for resource");

								Thread.sleep(2000);
							}
							catch(Exception e)
							{
								System.out.println(e);
							}
							synchronized(str2)
							{
								System.out.println("thread 1 acquires resourse 2");
							}
							
						}
					}
				};
		Thread t2=new Thread()
				{
					public void run()
					{
						synchronized(str2)
						{
							System.out.println("thread 2 acquires resourse 2");
							try
							{
								System.out.println("waiting for resource");
								Thread.sleep(2000);
							}
							catch(Exception e)
							{
								System.out.println(e);
							}
							synchronized(str1)
							{
								System.out.println("thread 2 acquires resource 1");
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
