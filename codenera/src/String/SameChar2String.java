package String;

import java.util.Scanner;

public class SameChar2String
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first String");
		String s1=sc.next();
		System.out.println("enter the second string");
		String s2=sc.next();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("both string length are  same");
		}
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		int c=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				c++;
			}
		}
		System.out.println(c);
	}
}
