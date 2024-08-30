package String;

import java.util.Scanner;

public class StringMethodExtractInteger1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				System.out.println(ch[i]);
				if(Character.isDigit(ch[i+1]))
				{
					System.out.println(ch[i+1]);
				}
				System.out.println("");
			}
		}
	}

}
