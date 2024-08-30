package RevisionPractice;

import java.util.Scanner;

public class MissingNo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size =sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter elemnet of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int n=5;
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int total=n*(n+1)/2;
		System.out.println("sum of element:"+total);
		int m=total-sum;
		System.out.println("missing no is:"+m);
		
		
	}

}
