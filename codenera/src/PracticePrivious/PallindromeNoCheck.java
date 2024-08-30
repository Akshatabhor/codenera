package PracticePrivious;
import java.util.Scanner;
public class PallindromeNoCheck 
{
	public void PallindromeNoCheck()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		int rem=0;
		int rev=0;
		int sum=0;
		for(int i=no;i!=0;i=i/10)
		{
			rem=i%10;
			rev=(rev*10)+rem;
		}
		System.out.println("reverse of given no:"+rev);
		if(rev==no)
		{
			System.out.println("this no is pallindrome");
		}
		else 
		{
			System.out.println("this no is not pallindrome");
		}
	}

	public static void main(String[] args) 
	{
		PallindromeNoCheck obj=new PallindromeNoCheck();
		obj.PallindromeNoCheck();
	}

}
