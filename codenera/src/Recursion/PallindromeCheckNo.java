package Recursion;

import java.util.Scanner;

public class PallindromeCheckNo
{
	static int rev=0;
	public static int rev(int n)
	{
		if(n!=0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			rev(n/10);
		}
		return rev;
	}
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter a no");
    	int n=sc.nextInt();
    	
    	int rev=PallindromeCheckNo.rev(n);
    	if(rev==n)
    	{
    		System.out.println("given no is pallindrome");
    	}
    	else
    	{
    		System.out.println("given no is not pallindrome");
    	}
    	
    }

    
}
