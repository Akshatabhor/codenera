package StringRevisionPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram

{
	public char[] converttochararray(String str) {
		char s[]=str.toCharArray();
		return s;
	}
	public  char[] arraysort(char[] a) {
		Arrays.sort(a);
		return a;
	}
	public  String converttochararray(char[] s1) {
	String str=new String(s1);
		return str;
	}


	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two String");
		String str1=sc.next();
		String str2=sc.next();
		
		str1.toLowerCase();
		str2.toLowerCase();
		
		Anagram obj=new Anagram();
		
		char s1[]=obj.converttochararray(str1);
		char s2[]=obj.converttochararray(str2);
		
		char sorts1[]=obj.arraysort(s1);
		char sorts2[]=obj.arraysort(s2);
		
		String S3=obj.converttochararray(sorts1);
		String s4=obj.converttochararray(sorts2);
		
		if(S3.equals(s4))
		{
			System.out.println("given string is angram");
		}
		else
		{
			System.out.println("given String is not angram");
		}
		
	}
	
	
	
}