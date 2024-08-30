package RevisionPractice;

import java.util.Scanner;

public class CheckPallindromeNo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		int rem=0;int rev=0;
		for(int i=no;i!=0;i=i/10)
		{
			rem=i%10;
			rev=(rev*10)+rem;
		}
		System.out.println("reverse no:"+rev);
		if(no==rev)
		{
			System.out.println("Given No is Pallindrome");
		}
		else
		{
			System.out.println("Given No is Not Pallindrome");
		}
	}

}
