package String;

import java.util.Scanner;

public class ReplaceFirstCharwithAnotherString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		System.out.println("enter the character we want to replace");
		char ch=sc.next().charAt(0);
		System.out.println("enter character we want replace with this");
		char rechar=sc.next().charAt(0);
		
		char s[]=str.toCharArray();
		String ans=str.replaceFirst(Character.toString(ch), Character.toString(rechar));
		System.out.println("after repecing first occurance character:"+ans);
		
	}

}
