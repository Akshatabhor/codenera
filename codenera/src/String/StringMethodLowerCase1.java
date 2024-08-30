package String;

import java.util.Scanner;

public class StringMethodLowerCase1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.next();
		str=str.toLowerCase();
		System.out.println("string in Lowercase:"+str);
	}

}
