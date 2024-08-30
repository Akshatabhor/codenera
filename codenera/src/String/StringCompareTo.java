package String;

import java.util.Scanner;

public class StringCompareTo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter String 1: ");
		//String str = sc.next();   
		//System.out.println("Enter String 2: ");
		//String str1=sc.next();
		//a aacci value is 97
		//A aacci value is 65
		//"abcd""ABCD"
		
		String str="Akshata";
		String str1="Akshatabhor";
		if(str.compareTo(str1)<0)
		{
			System.out.println("str1 is greater than str");
		}
		else if(str.compareTo(str1)>0)
		{
			System.out.println("str is greater than str1");
		}
		else
		{
			System.out.println("both string are equal");
		}
	}

}
