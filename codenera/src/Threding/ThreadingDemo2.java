package Threding;

public class ThreadingDemo2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello word");
		}
	}
	public static void main(String[] args) 
	{
		ThreadingDemo2 t1=new ThreadingDemo2();
		t1.start();
		System.out.println("main completed");
	}

}
