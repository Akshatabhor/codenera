package ExceptionHandling;

import java.util.Scanner;

public class Throw 
{
	public void cal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two no:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n2<=0)
		{
			throw new ArithmeticException("the no is zero or less than zero");
		}
	}

	public static void main(String[] args) 
	{
		Throw obj=new Throw();
		try
		{
		obj.cal();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
