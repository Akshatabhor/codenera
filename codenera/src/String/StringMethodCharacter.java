package String;

import java.util.Scanner;

public class StringMethodCharacter {

	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String : ");
			String str = sc.next();
			
			System.out.println("Enter position : ");
			int i = sc.nextInt();
			
			char ch = str.charAt(i); 
			
		
			System.out.println("char at "+i+"th  position : "+ch);
			
			System.out.println("character in string using charAt() method :  ");
			for(int j = 0;j<str.length();j++)
			{
				System.out.println(str.charAt(j));
			}
			
			
		}
	}


