package oops;

import java.util.Scanner;

public class pallindromenoreturnwithargument 
{
	public void findpalindrome(int a[])
	{
		
		
		System.out.println("palindrome element in array:");

		for(int i=0;i<a.length;i++)
		{
			int rem=0;
			int rev=0;
			for(int j=a[i];j!=0;j=j/10)
			{
				rem=j%10;
				rev=(rev*10)+rem;
			}
			if(a[i]==rev)
			{
				System.out.println(a[i]);
			}
			
		}

	}
	

	public static void main(String[] args) 
	{
		
		int a[]= {121,123,131,456,313};

		pallindromenoreturnwithargument obj=new pallindromenoreturnwithargument();
		obj.findpalindrome(a);
	}

}
