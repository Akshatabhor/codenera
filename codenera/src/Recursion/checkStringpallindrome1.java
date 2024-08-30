package Recursion;

import java.util.Scanner;

public class checkStringpallindrome1
{
	public boolean disp(String s)
	{
		if(s.length()<=1)
		{
			return true;
		}
		if(s.charAt(0)!=s.charAt(s.length()-1))
		{
			return false;
		}
		return disp(s.substring(1, s.length()-1));
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String:");
		String s=sc.nextLine();
		checkStringpallindrome1 ob=new checkStringpallindrome1();
		System.out.println(ob.disp(s));
	}

}
