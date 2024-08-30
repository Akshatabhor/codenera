package oops;

import java.util.Scanner;

public class maximumsecmaximum 
{
	public void maximumsec(int n)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element of array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		int secmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
			}
			else if((a[i]>secmax)&& a[i]!=max)
			{
				secmax=max;
			}
		}
		System.out.println("enter the max no:"+max);
		System.out.println("enter the secmax no:"+secmax);
	}

	public static void main(String[] args) 
	{
		maximumsecmaximum obj=new maximumsecmaximum();
		System.out.println("main method started..........");
		obj.maximumsec(10);
		System.out.println("main method completed......");

	}

}
