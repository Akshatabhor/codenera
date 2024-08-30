package oops;
import java.util.Scanner;
public class oddnumberwithreturnwitharg 
{
	public int[] oddnumberwithreturnwitharg(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		oddnumberwithreturnwitharg obj=new oddnumberwithreturnwitharg();
		int[] sortedarray=obj.oddnumberwithreturnwitharg(a);
		System.out.println("element in decending order:");
		for(int i=0;i<sortedarray.length;i++)
		{
			System.out.println(sortedarray[i]+" ");
		}
		
	}

}
