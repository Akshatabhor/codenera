package String;
import java.util.Random;
import java.util.Scanner;

public class StringMethodSwappinglastTwochar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		
		char s[]=str.toCharArray();
		
			char t=s[s.length-1];   
			s[s.length-1]=s[s.length-2];
			s[s.length-2]=t;
	
		System.out.println(s);
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		str=str.toUpperCase();
		char first=str.charAt(0);
		int l=str.length();
		char last=str.charAt(l);
	
		String mid=str.substring(1,l-1);
		String result=first+mid+last;
		System.out.println("swapp first and last:"+result);*/
		

	}

}
