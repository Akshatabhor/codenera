package RevisionPractice;

import java.util.Scanner;

public class intersection {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st size");
		int size1=sc.nextInt();
		System.out.println("enter 2nd size");
		int size2=sc.nextInt();
		
		int a[]=new int[size1];
		int b[]=new int[size2];
		
		System.out.println("enter size1 element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter size2 element");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("intersection of array");
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
			if(c==1)
			{
				System.out.println(a[i]);
			}
		}
	}

}
