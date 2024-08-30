package RevisionPractice;

import java.util.Scanner;

public class AnticlockwiseRotationNposition {

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
		System.out.println("how many times rotation");
		int n=sc.nextInt();
		
		for(int j=0;j<n;j++)
		{
			int temp=a[0];
			for(int i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
		}
		System.out.println("array after clockwise rotation by 2");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
