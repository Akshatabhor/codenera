package String;

import java.util.Scanner;

public class Equaligonre {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str = sc.next();   
		System.out.println("Enter String 2: ");
		String str1=sc.next();
		
		if(str.equalsIgnoreCase(str1)==true)
		{
			System.out.println("both string are equal");
		}
		else
		{
			System.out.println("str is not equal to str1");
		}
	}

}
