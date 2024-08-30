package RevisionPractice;

import java.util.Scanner;

public class sumofelement {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		
		int a[]=new int[size];

		System.out.println("enter element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
				sum=sum+a[i];

		}
		System.out.println("sum of element: "+sum);
			
	}

}
