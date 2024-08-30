package String;

import java.util.Scanner;

public class ReplaceAllWhitespacewithSpecialChar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		String replacestring=s.replaceAll("\\s", "*");
		System.out.println("original String:"+s);
		System.out.println("replacing String:"+replacestring);
	}

}
