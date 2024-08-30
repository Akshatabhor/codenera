package String;

import java.util.Scanner;

public class OddIndexCharWithSpecialChar {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		System.out.println("Print Odd Number of Character");
		for(int i = 0;i < str.length();i=i+2)
		{
			c[i]='*';
		}
		String Modifiedstr=new String(c);
		System.out.println("modified string  odd character index with *:");
		System.out.println(Modifiedstr);
	}

}
