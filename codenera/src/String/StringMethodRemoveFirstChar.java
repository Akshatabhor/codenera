package String;

import java.util.Scanner;

public class StringMethodRemoveFirstChar {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.next();
		char c[]=new char[str.length()-1];
		int x=0;
		for(int i=1;i<str.length();i++)
		{
			c[x++]=str.charAt(i);
		}
		String s1=new String(c);
		System.out.println("1st character remove:"+s1);
	}

}
