package String;

import java.util.Scanner;

public class StringMethodConcatenate {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
		System.out.println("Enter String :");
		String str1=sc.next();
		String str3=str.concat(str1);
		System.out.println("Concate String:"+str3);
		
	}

}
