package oops;

import java.util.Scanner;

public class factorialnowitharument 
{
	public void findfactorial(int no)
	{
		int fact=1;
		while(no>1)
		{
			fact=fact*no;
			no--;
		}
		System.out.println("factorial of given no is:"+fact);
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int no =sc.nextInt();
		factorialnowitharument obj=new factorialnowitharument();
		obj.findfactorial(no);
	}

}
