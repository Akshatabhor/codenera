package Threding;
 class ThreadingDemo1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class ThreadingDemo extends Thread
{
	public void run()
	{
	 for(int i=0;i<=10;i++)
	{
		if(i%2==1)
		{
			System.out.println(i);
		}
	}
		
}

	public static void main(String[] args)
	{
		ThreadingDemo t1=new ThreadingDemo();
		t1.start();
		ThreadingDemo1 t2=new ThreadingDemo1();
		t2.start();
		System.out.println("main completed");
	}

}
