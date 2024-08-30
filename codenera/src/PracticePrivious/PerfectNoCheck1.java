/*1. WAP to check the perfect number using java? 
*/

package PracticePrivious;

import java.util.Scanner;

public class PerfectNoCheck1 
{
	public void PerfectNoCheck1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<n ; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		//System.out.println(sum);
		System.out.println(sum == n ? "Entered Number is perfect number" : "Entered number is not perfect number");
	}

	public static void main(String[] args) 
	{
		PerfectNoCheck1 obj=new PerfectNoCheck1();
		obj.PerfectNoCheck1();
		
	}

}
