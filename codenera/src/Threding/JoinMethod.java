package Threding;
class JoinMethod1 extends Thread
{
	public void run()
	{
		System.out.println("pallindrome series.....");
		for(int i=1;i<=100;i++)
		{
			int rem=0;int rev=0;
			for(int j=i;j!=0;j=j/10)
			{
				rem=j%10;
				rev=(rev*10)+rem;
			}
			if(i==rev)
			{
				System.out.println(rev);
			}
		}
		
	}
}
public class JoinMethod extends Thread
{
	public void run()
	{
		System.out.println("prime series....");
		for(int i=1;i<=100;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		JoinMethod t1=new JoinMethod();
		
		JoinMethod1 t2=new JoinMethod1();
		
		try 
		{
			
			t1.start();
			t1.join();
			t2.start();
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
				
		System.out.println("main completed");
	}

}
