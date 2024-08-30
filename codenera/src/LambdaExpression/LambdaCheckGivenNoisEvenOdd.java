package LambdaExpression;

import java.util.Scanner;

@FunctionalInterface
interface demo8
{
	public void evenodd(int a);
}
public class LambdaCheckGivenNoisEvenOdd 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int no=sc.nextInt();
		demo8 ob=(int a) ->{
			if(a%2==0)
			{
				System.out.println("Given no is even");
			}
			else
			{
				System.out.println("Given no is odd");
			}
		};
		ob.evenodd(no);
	}

}
