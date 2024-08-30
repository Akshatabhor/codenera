package RevisionPractice;

import java.util.Scanner;

public class ArraySecminElement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		int secmax=0;
		int min=Integer.MAX_VALUE;
		int secmin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				secmin=min;
				min=a[i];
			}
			else if(a[i]<secmin && a[i]!=min)
			{
				secmin=a[i];
			}
		}
		System.out.println("secmin element:"+secmin);
		System.out.println("min element:"+min);
	}

}
