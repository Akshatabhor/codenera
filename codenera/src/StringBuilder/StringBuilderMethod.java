package StringBuilder;

import java.util.Scanner;

public class StringBuilderMethod {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		StringBuilder sb1=new StringBuilder(sc.next());
		
		System.out.println(sb1);
		
		sb1.append('p');
		System.out.println("string append:"+sb1);
		
		sb1.insert(0, 'p');
		System.out.println("String insert:"+sb1);
		
		sb1.charAt(0);
		System.out.println("CharaAt 0:"+sb1);
		
		System.out.println("index of j:"+sb1.indexOf("j"));
		
		System.out.println("replace of string:"+sb1.replace(0, 0, "python"));
		
		System.out.println("index of java:"+sb1.indexOf("java"));
		
		System.out.println("index of java:"+sb1.lastIndexOf("java"));

		System.out.println("substring of java:"+sb1.substring(0));
		
		System.out.println("substring of java start and last:"+sb1.substring(5, 9));
		
		System.out.println("reverse of string:"+sb1.reverse());

	}

}
