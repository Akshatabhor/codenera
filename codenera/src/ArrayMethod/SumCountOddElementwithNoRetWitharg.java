package ArrayMethod;

import java.util.Scanner;

public class SumCountOddElementwithNoRetWitharg 
{
	public void SumCountOddElementwithNoRetWitharg(int[] a)
	{
		int sum=0;
		int count=0;
		System.out.println("odd element sum and count:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]+" ");
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println("sum of off element:"+sum);
		System.out.println("count of odd element:"+count);
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int[] a=new int [size];
		System.out.println("enter the element of array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		SumCountOddElementwithNoRetWitharg obj=new SumCountOddElementwithNoRetWitharg();
		obj.SumCountOddElementwithNoRetWitharg(a);
		
	}

}
