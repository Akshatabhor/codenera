package RevisionPractice;

import java.util.Scanner;

public class TargetValue {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("enter the elemnt of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the target value");
		int v=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==v)
				{
					System.out.println(a[i]+"+"+a[j]+"="+v);
				}
			}
		}
	}

}