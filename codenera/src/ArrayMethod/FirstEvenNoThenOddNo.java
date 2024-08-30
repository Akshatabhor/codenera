package ArrayMethod;

import java.util.Scanner;

public class FirstEvenNoThenOddNo 
{
	public void FirstEvenNoThenOddNo()
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
		System.out.println("even no:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("odd no");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args)
	{
		FirstEvenNoThenOddNo obj=new FirstEvenNoThenOddNo();
		obj.FirstEvenNoThenOddNo();
	}

}
