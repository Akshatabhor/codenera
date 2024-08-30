package ArrayMethod;

import java.util.Scanner;

public class primenonoreturnwithnoargument 
{
	public void primenonoreturnwithnoargument()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("prime no in given array:");

		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int c=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(a[i]);
			}
		}
		
	}
	public static void main(String[] args)
	{
		primenonoreturnwithnoargument obj=new primenonoreturnwithnoargument();
		obj.primenonoreturnwithnoargument();
	}

}
