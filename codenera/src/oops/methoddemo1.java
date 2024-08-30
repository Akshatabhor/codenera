package oops;
import java.util.Scanner;
public class methoddemo1 
{
	public void primecheck() //no return type no argument
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				c=1;
				break;
				
			}
		}
		if(c==0 && n!=1)
		{
			System.out.println("given number is prime");
		}
		else
		{
			System.out.println("given number is not prime");
		}
	}
	public static void main(String[] args) 
	{
		methoddemo1 obj=new methoddemo1();
		
		System.out.println("main started.....");
		obj.primecheck();
		System.out.println("main method completed....");
	}

}
