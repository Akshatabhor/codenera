package ExceptionHandling;

import java.util.Scanner;

public class tryCatchFinallyDemo1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number:");
		try
		{
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			double ans=n1/n2;
			System.out.println(ans);
		}
		catch(Exception e)
		{
			System.out.println("exception occuer:"+e);
		}
		finally
		{
			System.out.println("final block executed");
		}
		
	}

}
