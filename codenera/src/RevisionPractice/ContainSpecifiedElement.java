package RevisionPractice;

import java.util.Scanner;

/*Q.3 Write a Java program to check if an array of integers contains two specified elements 65 and 77.*/
public class ContainSpecifiedElement {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter first element we want to search");
		int ele1=sc.nextInt();
		System.out.println("enter the second element we want to search");
		int ele2=sc.nextInt();
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele1)
			{
				c++;
			}
		}
		int c2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele2)
			{
				c2++;
			}
		}
		if(c!=0)
		{
			System.out.println("specified element present in array:"+ele1);

		}
		else
		{
			System.out.println("specified element is not present in array:"+ele1);

		}
		if(c2!=0)
		{
			System.out.println("specified element present in array:"+ele2);

		}
		else
		{
			System.out.println("specified element is not present in array:"+ele2);

		}
		
	}

}
