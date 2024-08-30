package oops;
import java.util.Scanner;
public class arrayadditionmethodwithreturnnowitharg 
{
	public int addarrayele(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		arrayadditionmethodwithreturnnowitharg obj=new arrayadditionmethodwithreturnnowitharg();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int add =obj.addarrayele(a);
		System.out.println("addition of array element:"+add);
	}

}
