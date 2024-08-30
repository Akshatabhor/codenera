package PracticePrivious;
import java.util.Scanner;
public class AmstrongNoCheck 
{
	public void AmstrongNoCheck()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
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
			System.out.println("given no is amstrong");
		}
		else
		{
			System.out.println("given no is not amstrong");

		}
	}
	public static void main(String[] args) 
	{
		AmstrongNoCheck obj=new AmstrongNoCheck();
		obj.AmstrongNoCheck();
	}

}
