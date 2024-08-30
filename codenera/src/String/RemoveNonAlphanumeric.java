package String;

import java.util.Scanner;

public class RemoveNonAlphanumeric 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = scanner.nextLine();

        String result = removeNonAlphanumeric(input);

        System.out.println("String after removing non-alphanumeric characters:");
        System.out.println(result);

    
    }

    public static String removeNonAlphanumeric(String str) 
    {
        String regex = "[^a-zA-Z0-9]";

        return str.replaceAll(regex, "");
    }
}

