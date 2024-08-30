/*8. How do you find the nth Fibonacci number using recursion in Java?
*/

package Recursion;

import java.util.Scanner;

public class FibbonacciRecurision
{
	static int n1=0,n2=1,n3;
	
	public void disp(int n)
	{
		if(n>0)
		{
			n3=n1+n2;
			
			System.out.print(n3+" ");
			
			n1=n2;
			n2=n3;
			disp(n-1);
		}
	}

	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		FibbonacciRecurision ob=new FibbonacciRecurision();
		System.out.println("Enter a No");
		int no=sc.nextInt();
		ob.disp(no);
		
	}

}
