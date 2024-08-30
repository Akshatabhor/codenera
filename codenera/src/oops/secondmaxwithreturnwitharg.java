package oops;
import java.util.Scanner;
public class secondmaxwithreturnwitharg 
{
	public int findsecmax(int a[])
	{
		int secmax=0, secmin=Integer.MAX_VALUE;
		int max=0, min=Integer.MAX_VALUE;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
			}
			else if(a[i]>secmax && a[i]!=max)
			{
				secmax=max;
			}
		}
		System.out.println("max element in array:"+max);
		return secmax;
	}

	public static void main(String[] args) 
	{
		secondmaxwithreturnwitharg obj=new secondmaxwithreturnwitharg();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = sc.nextInt();
		int a[] = new int[size] ;
		System.out.println("enter the array of element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int secmax=obj.findsecmax(a);
		System.out.println("enter the secmax element:"+secmax);

	}

}
