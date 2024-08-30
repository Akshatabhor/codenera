/*check prime or not using lambda*/
package LambdaExpression;

import java.util.Scanner;

interface demo14
{
	public void disp();
}
public class LambaCheckGivenNoIsPrimeOrNot 
{

	public static void main(String[] args) 
	{
		demo14 ob=()->{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no");
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
		};
		ob.disp();
	}

}
