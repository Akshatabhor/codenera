
/*1.Write a Java function to print numbers from 1 to N using recursion.
*/
package Recursion;

import java.util.Scanner;

public class Q1
{
	static int c=0;

	public void disp(int n)
	{
		c++;
		if(n>0)
		{
			System.out.println(c+" ");
			disp(n-1);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int n=sc.nextInt();
		
		Q1 ob=new Q1();
		ob.disp(n);
		
	}

}
