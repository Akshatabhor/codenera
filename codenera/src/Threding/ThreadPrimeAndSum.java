package Threding;

import java.util.Scanner;

public class ThreadPrimeAndSum extends Thread
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int first=sc.nextInt();
		System.out.println("enter the last no");
		int last=sc.nextInt();
		for(int i=first;i<=last;i++)
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
		System.out.println("main started");
		ThreadPrimeAndSum t1=new ThreadPrimeAndSum();
		ThreadPrimeAndSum t2=new ThreadPrimeAndSum();
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
