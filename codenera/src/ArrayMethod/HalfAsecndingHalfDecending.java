package ArrayMethod;

import java.util.Scanner;

public class HalfAsecndingHalfDecending 
{
	public void HalfAsecndingHalfDecending()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = sc.nextInt();

		int a[]=new int[size];

		System.out.println("enter the array element:");
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
		System.out.println("half asending decending array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=a.length/2;i<a.length;i++)
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
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
	public static void main(String[] args)
	{
		HalfAsecndingHalfDecending obj=new HalfAsecndingHalfDecending();
		obj.HalfAsecndingHalfDecending();
	}

}
