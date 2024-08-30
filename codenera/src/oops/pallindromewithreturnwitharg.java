package oops;
import java.util.Scanner;
public class pallindromewithreturnwitharg 
{
	public boolean checkpallindrome(int no)
	{
		boolean b=false;
		int temp=no;
		int rem=0,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
		if(rev==no)
		{
			b=true;
		}
		else
		{
			b=false;
		}
		return b;
	}

	public static void main(String[] args) 
	{
		pallindromewithreturnwitharg obj=new pallindromewithreturnwitharg();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int no=sc.nextInt();
		boolean b=obj.checkpallindrome(no);
		if(b==true)
		{
			System.out.println("given no is pallindrome");
		}
		else
		{
			System.out.println("given no is not pallindrome");
		}
		}

}
