package String;

import java.util.Scanner;

public class StringMethodKeypadTyping1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.next();
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			switch(ch)
			{
			case'A':
			case'B':
			case'c':System.out.println(2);
			break;
			case'D':
			case'E':
			case'F':System.out.println(3);
			break;
			case'G':
			case'H':
			case'I':System.out.println(4);
			break;
			case'J':
			case'K':
			case'L':System.out.println(5);
			break;
			case'M':
			case'N':
			case'O':System.out.println(6);
			break;
			case'P':
			case'Q':
			case'R':System.out.println(7);
			break;
			case'S':
			case'T':
			case'V':System.out.println(8);
			break;
			case'w':
			case'x':
			case'y':
			case'z':System.out.println(9);
			break;
			}
		}
	}

}
