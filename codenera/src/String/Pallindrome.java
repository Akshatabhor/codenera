/*3. Write a program that takes in a string and checks if it is a palindrome (reads the
same forwards and backwards).*/

package String;

import java.util.Scanner;

public class Pallindrome
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome: ");
        String str = scanner.nextLine();
        
        boolean isPalindrome = checkPalindrome(str);
        
        if (isPalindrome) 
        {
            System.out.println("The string is a palindrome.");
        }
        else 
        {
            System.out.println("The string is not a palindrome.");
        }
     }
    
    public static boolean checkPalindrome(String str) 
    {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
