/*7. Write a program that takes in a string and converts all the uppercase letters to
lowercase.*/

package String;

import java.util.Scanner;

public class StringMethodLowerCase {

	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String : ");
			String str = sc.next();
			
			str = str.toLowerCase(); // Lowercase
			
			System.out.println("Lowercase str : "+str);
		}
	}


