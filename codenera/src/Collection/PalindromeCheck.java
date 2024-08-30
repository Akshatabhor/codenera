package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeCheck {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 2, 1);

        boolean isPalindrome = isPalindrome(list);

        if (isPalindrome) {
            System.out.println("The ArrayList is palindrome.");
        } else {
            System.out.println("The ArrayList does not form a palindrome.");
        }
    }

    public static <T> boolean isPalindrome(ArrayList<T> list) 
    {

    	ArrayList<T> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);

        return list.equals(reversedList);
    }
}
