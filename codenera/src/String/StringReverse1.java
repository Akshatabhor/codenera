package String;

import java.util.Scanner;

public class StringReverse1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		
		char c[]=new char[str.length()];
		int ind=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			c[ind]=str.charAt(i);
			ind++;
		}
		String rev=new String(c);
		System.out.println("reverse string:"+rev);
		if(str.equals(rev))
		{
			System.out.println("given string is pallindrome");
			
		}
		else
		{
			System.out.println("given string is not pallindrome");
			
		}
		
	}

}
