package Threding;

public class ImplementingThread implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+i);
			//System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		ImplementingThread obj=new ImplementingThread();
		Thread t1=new Thread(obj);
		t1.start();
		t1.join();
		System.out.println("main completed");
	}

}
