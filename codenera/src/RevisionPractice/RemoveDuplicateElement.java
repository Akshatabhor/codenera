package RevisionPractice;

import java.util.Scanner;

public class RemoveDuplicateElement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
		}
		System.out.println("after removing duplicate element");
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				System.out.println(a[i]);
				c++;
			}
		}
	}

}
