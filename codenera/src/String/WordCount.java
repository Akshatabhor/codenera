package String;

import java.util.Scanner;

public class WordCount 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("The number of words in the string is: " + wordCount);

        
    }

    public static int countWords(String str)
    {
        if (str == null || str.isEmpty())
        {
            return 0;
        }

        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}


