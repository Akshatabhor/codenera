package String;

import java.util.Scanner;

public class StringFindCountWordCharExculdingSpace {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		String s[]=str.split(" ");
		System.out.println("words count:"+s.length);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("char count:"+count);
	}

}
