package String;

import java.util.Scanner;

public class StringMethodRemoveLastChar 
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.next();
		char c[]=new char[str.length()-1];
		
		for(int i=0;i<str.length()-1;i++)
		{
			c[i]=str.charAt(i);
		}
		String s1=new String(c);
		System.out.println("last character remove:"+s1);
	}

}
