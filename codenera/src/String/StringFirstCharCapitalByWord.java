package String;

import java.util.Scanner;

public class StringFirstCharCapitalByWord
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String s[]=str.split(" ");
		
		String snew[]=new String[s.length];
		for(int i=0;i<s.length;i++)
		{
			snew[i]=Character.toUpperCase(s[i].charAt(0))+s[i].substring(1);
		}
		for(int i=0;i<snew.length;i++)
		{
			System.out.println(snew[i]+" ");
		}
	}

}
