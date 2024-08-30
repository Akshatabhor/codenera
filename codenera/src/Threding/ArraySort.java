package Threding;

import java.util.Arrays;
import java.util.Scanner;

class ArraysAscending extends Thread
{
	 int[] a;
	ArraysAscending(int a[])
	{
		this.a=a;
	}
	public void run()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Ascending Arrays ......");

		System.out.println(Arrays.toString(a));
	}
}
public class ArraySort extends Thread
{
	 int[] a;
	ArraySort(int a[])
	{
		this.a=a;
	}
	public void run()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Decending Arrays ......");

		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of arrays");
		int size =sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter Elements Of arrays");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		ArraysAscending t1=new ArraysAscending(a);
		ArraySort t2=new ArraySort(a);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
	}

}
