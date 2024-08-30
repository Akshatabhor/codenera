package String;

import java.util.Scanner;

public class StringContainsMethod {

	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String 1: ");
			String s1 = sc.nextLine();   
			System.out.println("Enter String 2: ");
			String s2=sc.next();
			if(s1.contains(s2))
			{
				System.out.println(s2+" contain present in first str");
			}
			else 
			{
				System.out.println(s2+" contains not present in first str");
			}
		}
	}


