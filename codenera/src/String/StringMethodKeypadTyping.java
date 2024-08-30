package String;
import java.util.Scanner;
public class StringMethodKeypadTyping {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			switch(ch)
			{
			case 'A':
			case 'B':
			case 'C':System.out.print(2);
			break;
			case 'D':
			case 'E':
			case 'F':System.out.print(3);
			break;
			case 'G':
			case 'H':
			case 'I':System.out.print(4);
			break;
			case 'J':
			case 'K':
			case 'L':System.out.print(5);
			break;
			case 'M':
			case 'N':
			case 'O':System.out.print(6);
			break;
			case 'P':
			case 'Q':
			case 'S':System.out.print(7);
			break;
			case 'T':
			case 'U':
			case 'V':System.out.print(8);
			break;
			case 'W':
			case 'X':
			case 'Y':
			case 'z':System.out.print(9);
			break;
			
			}
		}
		
	}

}
