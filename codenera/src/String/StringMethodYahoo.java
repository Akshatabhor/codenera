package String;

import java.util.Scanner;

public class StringMethodYahoo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		
		char ch=str.charAt(0);
		System.out.println("change the string");
		if(Character.isLowerCase(ch))
		{
			String str1=str.toLowerCase();
			System.out.println(str1);
		}
		else if(Character.isUpperCase(ch))
		{
			String str1=str.toUpperCase();
			System.out.println(str1);
		}
	}

}
