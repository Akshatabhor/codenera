package String;

import java.util.Scanner;

public class WhiteSpceRemover 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		String trimstring=removeLeadingAndTrailingWhitespace((str));
		
        System.out.println("String after removing leading and trailing whitespace: '" + trimstring + "'");
        
       }
	public static String removeLeadingAndTrailingWhitespace(String str1)
	{
		return str1.trim();
	}
}
