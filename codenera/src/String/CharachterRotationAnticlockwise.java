package String;

import java.util.Scanner;

public class CharachterRotationAnticlockwise {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		
		char s[]=str.toCharArray();
		char t=s[0];
		for(int i=0;i<s.length-1;i++)
		{
			s[i]=s[i+1];
		}
		s[s.length-1]=t;
		System.out.println("anticlockwise rotation");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+" ");
		}
		
	}

}
