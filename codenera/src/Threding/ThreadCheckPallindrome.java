package Threding;
import java.util.Scanner;
class ThreadCheckPrime extends Thread
{
	public void run()
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the number");
		//int no=sc.nextInt();
		int c=0;
		for(int i=1;i<=13;i++)
		{
			if(13%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("given no is prime");
		}
		else
		{
			System.out.println("given no is not prime");
		}
	}
}

public class ThreadCheckPallindrome extends Thread
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int rem=0;
		int rev=0;
		
		for(int i=no;i!=0;i=i/10)
		{
			rem=i%10;
			rev=(rev*10)+rem;
		}
		System.out.println("reverse of given no"+rev);
		if(rev==no)
		{
			System.out.println("given no is pallindrome");
		}
		else
		{
			System.out.println("given no is not pallindrome");
		}
		
	}

	public static void main(String[] args) 
	{
		System.out.println("main started....");
		ThreadCheckPallindrome t1=new ThreadCheckPallindrome();
		ThreadCheckPrime t2=new ThreadCheckPrime();
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
