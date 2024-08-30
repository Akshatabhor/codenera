package String;

import java.util.Scanner;

public class AsciiChecker 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		
		if(containsonlyAscii(str))
		{
			System.out.println("The String Contain Asscii Value");
		}
		else
		{
			System.out.println("the string contain asscii no value");

		}
	}
	public static boolean containsonlyAscii(String str1)
	{
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)>127)
			{
				return false;
			}
		}
		return true;
	}
}
