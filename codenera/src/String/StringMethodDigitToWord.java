package String;

import java.util.Scanner;

public class StringMethodDigitToWord {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			switch(ch[i])
			{
			case '1':System.out.println("one");
			break;
			case '2':System.out.println("two");
			break;
			case '3':System.out.println("three");
			break;
			case '4':System.out.println("four");
			break;
			case '5':System.out.println("five");
			break;
			case '6':System.out.println("six");
			break;
			case '7':System.out.println("seven");
			break;
			case '8':System.out.println("eight");
			break;
			case '9':System.out.println("nine");
			break;
			case '0':System.out.println("zero");
			break;
			
			}
		}
	}

}
