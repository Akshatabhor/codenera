package String;

import java.util.Scanner;

public class StringMethodReverse1 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		String s[]=str.split(" ");
	
		System.out.println("reverse string word by word:");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]+" ");
		}
		
	}

}
