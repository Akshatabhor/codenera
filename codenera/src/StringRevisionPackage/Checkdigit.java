package StringRevisionPackage;

import java.util.Scanner;

public class Checkdigit 
{
	public static boolean checkdigit(String str)
	{
		return str.matches("\\d+");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		
		if(checkdigit(s1))
		{
			System.out.println("digit is present");
		}
		else
		{
			System.out.println("not only digit present");
		}
	}

}
