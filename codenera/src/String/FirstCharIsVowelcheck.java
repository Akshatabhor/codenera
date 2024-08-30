package String;

import java.util.Scanner;

public class FirstCharIsVowelcheck {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.nextLine();
		
		char ch=str.charAt(0);
		
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println("String Start with voewl");
			}
			else
			{
				System.out.println("String not Start with voewl");
			}
		}
		
	}


