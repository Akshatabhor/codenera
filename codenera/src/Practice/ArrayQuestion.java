/*Q1.Given an array of integers of size n. Convert the array in such a way that if next valid number is same as current number, double its value and replace the next number with 0. After the modification, rearrange the array such that all 0�s are shifted to the end.

Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0

Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output : 4 2 12 8 0 0 0 0 0 0*/

package Practice;

import java.util.Scanner;

public class ArrayQuestion {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=a[i]*2;
					a[j]=0;
				}
				break;
			}
		
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]!=0)
					{
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
						break;
					}
				}
			}
		}
		System.out.println("modify element is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}

}
