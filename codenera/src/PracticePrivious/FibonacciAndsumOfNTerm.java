/*10. Write a program to find the sum of the first N terms of the Fibonacci sequence.
*/

package PracticePrivious;

import java.util.Scanner;

public class FibonacciAndsumOfNTerm 
{
	public void FibonacciAndsumOfNTerm()

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int no=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		int sum=0;
		System.out.println("fibbonaci series:");
		for(int i=1;i<=no;i++)
		{
			c=a+b;
			System.out.println(a);
			sum=sum+a;
			a=b;
			b=c;
		}
		System.out.println("sum of n term of fibboncci sequence:"+sum);
		
		
	}
	public static void main(String[] args) 
	{
		FibonacciAndsumOfNTerm obj=new FibonacciAndsumOfNTerm();
		obj.FibonacciAndsumOfNTerm();
	}

}
