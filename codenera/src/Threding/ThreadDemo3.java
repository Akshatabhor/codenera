package Threding;
class ThreadDemo31 extends Thread
{
	public void run()
	{
		for(int i=100;i>0;i--)
		{
			System.out.println(i);
		}
	}
}
public class ThreadDemo3 extends Thread
{
	public void run()
	{
		for(int i=1;i<100;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		ThreadDemo3 t1=new ThreadDemo3();
		t1.start();
		ThreadDemo31 t2=new ThreadDemo31();
		t2.start();
		System.out.println("main completed");
	}

}
