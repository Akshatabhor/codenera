package Threding;

public class VolatileDemo 
{
	static volatile  int counter=0;
	public static void main(String[] args)
	{
		Thread t1=new Thread(() ->
		{
			int localcounter=counter;
			while(localcounter < 10)
			{
				if(localcounter!=counter)
				{
					System.out.println("local counter change...");
					localcounter=counter;
				}
			}
		}
				);
		
		Thread t2=new Thread(()->
		{
			int localcounter=counter;
			while(localcounter<10)
			{
				System.out.println("Thread 2 increment local counter:"+localcounter++);
				counter=localcounter;
			}
		});
		System.out.println(counter);
		t1.start();
		
		t2.start();
	
		
		
	}

}
