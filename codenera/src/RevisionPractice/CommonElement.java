package RevisionPractice;

import java.util.Scanner;

public class CommonElement {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array 1,2,3");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int p=sc.nextInt();
		int a[]=new int [n];
		int b[]=new int[m];
		int c[]=new int[p];
		System.out.println("first array element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("second array element");
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}System.out.println("3rd array element");
		for(int i=0;i<p;i++)
		{
			c[i]=sc.nextInt();
		}
		
		System.out.println("Common elemnet are:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				for(int k=0;k<p;k++)
				{
					if(a[i]==b[j] && b[j]==c[k])
					{
						System.out.println(c[k]+" ");
					}
				}
			}
		}
	}

}
