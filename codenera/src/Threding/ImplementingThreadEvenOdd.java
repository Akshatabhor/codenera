package Threding;

public class ImplementingThreadEvenOdd implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("even no");
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("odd no");
		for(int i=0;i<=10;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
		ImplementingThreadEvenOdd obj=new ImplementingThreadEvenOdd();
		Thread t1=new Thread(obj);
		t1.start();
		t1.join();
	}

}
