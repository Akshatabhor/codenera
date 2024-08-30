package oops;
import java.util.Scanner;
public class primemethodreturnwithnoarg 
{
	public boolean isprime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int c=0;
		for(int i=2;i<a;i++)
		{
			if(a%2==0)
			{
				c=1;
				break;
			}
		}
		if(c==0 & a!=1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) 
	{
		primemethodreturnwithnoarg obj=new primemethodreturnwithnoarg();
		boolean p = obj.isprime();
		if(p==true)
		{
			System.out.println("given no is prime");
		}
		else
		{
			System.out.println("given no is not prime");
		}
	}

}
