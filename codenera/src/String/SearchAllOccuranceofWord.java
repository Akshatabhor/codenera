package String;

import java.util.Scanner;

public class SearchAllOccuranceofWord {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		
		String s[]=str.split(" ");
		int c=0;
		String word="portal";
		for(int i=0;i<s.length;i++)
		{
			if(word.equals(s[i]))
			{
				c++;
			}
			System.out.println(c);
		}
	}

}
