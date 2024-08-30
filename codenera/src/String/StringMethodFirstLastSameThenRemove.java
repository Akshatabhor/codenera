package String;
import java.util.Scanner;

public class StringMethodFirstLastSameThenRemove
{
	public static void main(String[] args)
	{
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");

	        String str = sc.nextLine();
	        String str1 = modifyString(str);

	        System.out.println("The given string is: " + str);
	        System.out.println("The new string is: " + str1);

	        sc.close();
	    }

	    public static String modifyString(String str) 
	    {
	        if (str.length() <= 1) {
	            // If the string length is 1 or less, no modification is needed
	            return str;
	        }

	        char firstChar = str.charAt(0);
	        char lastChar = str.charAt(str.length() - 1);

	        if (firstChar == lastChar) {
	            // Return the string without the first and last characters
	            return str.substring(1, str.length() - 1);
	        } else {
	            // Return the string unchanged
	            return str;
	        }
	    }
	}


