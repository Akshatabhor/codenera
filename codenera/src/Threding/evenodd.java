package Threding;

import java.util.Scanner;
class evenodd1 extends Thread
{
	int start,end;
	evenodd1(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		System.out.println("odd no");
		for(int i=start;i<=end;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
}
}
public class evenodd extends Thread
{
	int start,end;
	evenodd(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		System.out.println("even no");
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start number");
		int start=sc.nextInt();
		System.out.println("enter the end number");
		int end=sc.nextInt();
		evenodd t1=new evenodd(start,end);
		evenodd1 t2=new evenodd1(start,end);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}
