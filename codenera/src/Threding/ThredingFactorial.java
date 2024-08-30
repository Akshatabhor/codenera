package Threding;

public class ThredingFactorial extends Thread
{
	public void run()
	{
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of 5 is:"+fact);
	}
	public static void main(String[] args) 
	{
		ThredingFactorial t1=new ThredingFactorial();
		t1.start();
	}

}
