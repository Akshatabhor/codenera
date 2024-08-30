/*16. Write a program that takes in a string and returns the characters in reverse order, but
preserves the order of words.*/
package String;
import java.util.Scanner;

public class ReverseWordButPreserveOrder 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseCharactersInWords(inputString);
        
        System.out.println("String with characters reversed in each word: ");
        System.out.println(reversedString);
        
       
    }
    
    public static String reverseCharactersInWords(String str) 
    {
        if (str == null || str.isEmpty()) 
        {
            return str;
        }
        
        String[] words = str.split("\\s+");
        StringBuilder reversedString = new StringBuilder();
        
        for (String word : words)
        {
            String reversedWord = reverseString(word);
            reversedString.append(reversedWord).append(" ");
        }
        
        return reversedString.toString().trim();
    }
    
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}

