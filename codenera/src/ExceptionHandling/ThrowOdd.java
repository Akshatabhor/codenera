package ExceptionHandling;

import java.util.Scanner;

public class ThrowOdd 
{
	public void cal()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int n1=sc.nextInt();
	if(n1%2!=0)
	{
		throw new ArithmeticException("it is a odd no");
		}
	}
	

	public static void main(String[] args) 
	{
		ThrowOdd obj=new ThrowOdd();
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
