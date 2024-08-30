package String;

import java.util.Scanner;

public class LastOccuranceIndex 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the substring to find: ");
        String substring = scanner.nextLine();

        int lastIndex = findLastOccurrence(inputString, substring);

        if (lastIndex != -1) 
        {
            System.out.println("Last occurrence of '" + substring + "' is at index: " + lastIndex);
        } 
        else
        {
            System.out.println("Substring '" + substring + "' not found in the string.");
        }

    }

    public static int findLastOccurrence(String inputString, String substring) 
    {
        return inputString.lastIndexOf(substring);
    }
}
