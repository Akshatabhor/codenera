package RevisionPractice;

import java.util.Scanner;

public class ArraySecmaxElement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the element of array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;int secmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
			}
			else if(a[i]>secmax && a[i]!=max)
			{
				secmax=a[i];
			}
		}
		System.out.println("max of secmax element:"+secmax);
		System.out.println("max element:"+max);
		
	}

}

