package Threding;

import java.util.Scanner;

class fibonacciThread1 extends Thread
{
	int n;
	   public fibonacciThread1(int n) {
			this.n=n;
		}
	   public void run() {
		   int a=0;
		   int b=1;
		   int c=0;
		   for(int i=0;i<n;i++)
		   {
			   if(i>=n/2)
			   {
				   System.out.print(a+" ");
			   }
				   c=a+b;
				   a=b;
				   b=c;
			   
		   }
		   System.out.println();
}
}
public class fibonacciThread extends Thread
{
	 int n;
	   public fibonacciThread(int n) {
			this.n=n;
		}
	   public void run() {
		   int a=0;
		   int b=1;
		   int c=0;
		   for(int i=0;i<n/2;i++) {
			   System.out.print(a+" ");
			   c=a+b;
			   a=b;
			   b=c;
		   }
		   System.out.println();
	   }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		fibonacciThread t1=new fibonacciThread(n);
		fibonacciThread1 t2=new fibonacciThread1(n);
		
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
