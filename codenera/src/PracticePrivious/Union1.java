package PracticePrivious;

import java.util.Scanner;

public class Union1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size1=sc.nextInt();
		int size2=sc.nextInt();
		
		int a[]=new int[size1];
		int b[]=new int[size2];
		
		System.out.println("enter the elemnt of size 1");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the element of size2 ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		System.out.println("union of array");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c++;
					break;
				}
			}
			if(c==0)
			{
				System.out.println(a[i]);
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("intersection of array:");
		
		for(int i=0;i<a.length;i++)
		{
			int c1=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c1++;
					break;
				}
			}
			if(c1==1)
			{
				System.out.println(a[i]);
			}
		}
		
		
		
		
	}

}
