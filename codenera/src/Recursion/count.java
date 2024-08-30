/*4. Write a Java method to count the number of digits in an integer using recursion.
*/

package Recursion;

import java.util.Scanner;

public class count
{
	static int rem=0;
	int c=0;
	public int disp(int n)
	{
		if(n!=0)
		{
			rem=n%10;
			disp(n/10);
			c++;
		}
		return c;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		
		count ob=new count();
		int ans=ob.disp(n);
		System.out.println("count of digit:"+ans);
		
	}

}
