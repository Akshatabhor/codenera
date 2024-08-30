package String;

import java.util.Scanner;

public class StringMethodConvertArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		System.out.println("convert String into array:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
