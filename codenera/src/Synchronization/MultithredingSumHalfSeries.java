package Synchronization;

import java.util.Scanner;

public class MultithredingSumHalfSeries extends Thread
{
	static int a[];
	static int sum=0;
	int start,end;
	MultithredingSumHalfSeries(int start, int end)
	{
		this.start=start;
		this.end=end;
		
	}
	public void run()
	{
		
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
	}

}
