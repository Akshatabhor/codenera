/*6. Create a Java method to calculate the sum of digits of a positive integer using recursion.*/

package Recursion;

import java.util.Scanner;

public class sumofdigit 
{
	static int rem=0;
	int sum=0;
	public int disp(int n)
	{
		if(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			disp(n/10);
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		sumofdigit ob=new sumofdigit();
		int ans=ob.disp(n);
		System.out.println("Sum of Digit:"+ans);
	}

}
