package Threding;
import java.util.Scanner;
public class DaemonSorted extends Thread
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
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
		System.out.println("element in asending order:...");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
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
		System.out.println("element in decending order....");
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		System.out.println("main started");
		DaemonSorted t1=new DaemonSorted();
		t1.start();
	}

}
