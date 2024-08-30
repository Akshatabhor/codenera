package ArrayMethod;

import java.util.Scanner;

public class SumCountOfEvenNoPositonWise 
{
	public void SumCountOfEvenNoPositonWise()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		int count=0;
		System.out.println("even no position wise:");
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				System.out.println(a[i]+" ");
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println("sum of even number:"+sum);
		System.out.println("count of even no:"+count);
	}

	public static void main(String[] args) 
	{
		System.out.println("method started....");
		SumCountOfEvenNoPositonWise obj=new SumCountOfEvenNoPositonWise();
		obj.SumCountOfEvenNoPositonWise();
		System.out.println("method endeed.....");
	}

}
