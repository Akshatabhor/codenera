package String;

import java.util.Scanner;

public class StringMethodStartWith {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str = sc.next(); 
		if(str.startsWith("java"))
		{
			System.out.println("yes string start with java");
		}
		else
		{
			System.out.println("no string start with java");

		}
				
	}

}
