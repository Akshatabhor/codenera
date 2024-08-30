package String;

import java.util.Scanner;

public class StringMethodEndWith {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str = sc.next(); 
		if(str.endsWith("ing"))
		{
			System.out.println("yes string end with ing");
		}
		else
		{
			System.out.println("no string end with ing");

		}
	}

}
