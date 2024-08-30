package oops;
import java.util.Scanner;
public class primecheckno
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int no=sc.nextInt();
		int c=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("given no is prime");
		}
		else 
		{
			System.out.println("given no is not prime");
		}
	}


	public static void main(String[] args) 
	{
		primecheckno obj=new primecheckno();
		obj.run();
	}

}
