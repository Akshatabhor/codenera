package String;

import java.util.Scanner;

public class ReplaceOneSubstringToAnother 
{

	public static void main(String[] args) 
	{
		
		     Scanner scanner = new Scanner(System.in);
		        
		      System.out.println("Enter the main string: ");
		      String str = scanner.nextLine();
		        
		      System.out.println("Enter the substring to be replaced: ");
		      String str1= scanner.nextLine();
		       
		      System.out.println("Enter the replacement substring: ");
		      String s1 = scanner.nextLine();
		        
		      String s2 = str.replace(str1, s1);
		        
		      System.out.println("Resulting string: " + s2);
		        
		       
		    }
		

	}


