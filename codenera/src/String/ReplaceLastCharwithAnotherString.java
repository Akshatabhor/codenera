package String;

import java.util.Scanner;

public class ReplaceLastCharwithAnotherString 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter Character  you want repalce");
		char ch=sc.next().charAt(0);
		System.out.println("Enter Character  you want with this character");
		char rechar=sc.next().charAt(0);
		
		char s[]=str.toCharArray();
		int ind=str.lastIndexOf(ch);
		if(ind!=-1)
		{
			s[ind]=rechar;
		}
		String modifiy=new String(s);
		System.out.println(modifiy);

					
		}
	}


