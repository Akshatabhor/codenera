package String;

import java.util.Scanner;

	public class StringMethodCharacterareTwice 
	{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");

	        String str = sc.nextLine();

	        // Create a new string by repeating each character twice
	        String repeated = repeatCharacters(str);

	        System.out.println("The given string is: " + str);
	        System.out.println("The new string is: " + repeated);

	        sc.close();
	    }

	    public static String repeatCharacters(String str)
	    {
	        StringBuilder str1 = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            str1.append(ch).append(ch); // Append each character twice
	        }
	        return str1.toString();
	    }
	}



