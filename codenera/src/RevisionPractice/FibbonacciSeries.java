package RevisionPractice;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int no=sc.nextInt();
		
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=0;i<no;i++)
		{
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
	}

}
