/*7. WAP to check Armstrong number using java program
*/

package PracticePrivious;

import java.util.Scanner;

public class ArmstongNoCheck1 
{
	public void ArmstongNoCheck1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int no=sc.nextInt();
		int rem=0;
		int sum=0;
		for(int i=no;i!=0;i=i/10)
		{
			rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		if(sum==no)
		{
			System.out.println("given no is armstong");
		}
		else
		{
			System.out.println("given no is not armstong");
		}
	}
	public static void main(String[] args)
	{
		ArmstongNoCheck1 obj=new ArmstongNoCheck1();
		obj.ArmstongNoCheck1();
		
	}

}
