package RevisionPractice;

import java.util.Scanner;

public class SumCountEvenOddNo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("enetr the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
			System.out.println("even element");
		int sum=0;
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				sum=sum+a[i];
				c++;
			}
			
		}
		
		System.out.println("sum of even no:"+sum);
		System.out.println("count of even no:"+c);
		
	}

}
