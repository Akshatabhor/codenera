package Synchronization;
class interthreaddemo extends Thread
{
	int price =0;
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<=5;i++)
			{
				price=i*1000;
			}
			this.notifyAll();
		}
	}
}
public class WaitNotify
{

	public static void main(String[] args) throws InterruptedException
	{
		interthreaddemo t1=new interthreaddemo();
		t1.start();
		synchronized(t1)
		{
			t1.wait();
		}
		System.out.println("price:"+t1.price);
		System.out.println("main complteted");
	}

}
