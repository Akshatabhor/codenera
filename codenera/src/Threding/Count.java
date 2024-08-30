package Threding;
class CountDown extends Thread
{
	public void run()
	{
		System.out.println("count 100 to 1");
		for(int i=100;i>=1;i--)
		{
			System.out.println(i);
		}
	
	}
	
}
public class Count extends Thread
{
	public void run()
	{
		System.out.print("count 1 to 100:");
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) 
	{
		Count t1=new Count();
		CountDown t2=new CountDown();
try {
		t1.start();
		t1.join();
		t2.start();
		t2.join();
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
