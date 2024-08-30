package RevisionPractice;

import java.util.Scanner;

public class KthSmallestEle 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter Elements : ");
		for(int i = 0;i < a.length;i++)			
		{
			a[i] = sc.nextInt();
		}
		System.out.println("enter Kth value : ");
		int k = sc.nextInt();
		for(int i = 0;i < a.length;i++)
		{
			for(int j = i+1;j < a.length;j++)
			{
				if(a[i] > a[j])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("kth value of samllest element is : " + a[k-1]);


	}

}