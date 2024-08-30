package ArrayMethod;

import java.util.Scanner;

public class KthSmallest 
{
	public void KthSmallest()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = sc.nextInt();

		int a[]=new int[size];

		System.out.println("enter the element of array:");
		for(int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t = a[i];
				        a[i]= a[j];
					a[j]=t;
				}
			}
		}

		System.out.println("find k th smallest element:");
		int k = sc.nextInt();

		System.out.println(k+" smallest value in array:"+a[k-1]); 
		

	}
	public static void main(String[] args) 
	{
		KthSmallest obj=new KthSmallest();
		obj.KthSmallest();
	}

}
