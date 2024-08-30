package Threding;

import java.util.Scanner;

class fibbonacci extends Thread
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.println("fibbonaci series");
		for(int i=0;i<no;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
public class PrimeNdFibbonacci extends Thread
{
	public void run()
	{
		System.out.println("prime seriesfrom 1 to 50");
		for(int i=1;i<=50;i++)
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
		System.out.println("main Started...");
		PrimeNdFibbonacci t1=new PrimeNdFibbonacci();
		t1.start();
		fibbonacci t2=new fibbonacci();
		t2.start();
	}

}
