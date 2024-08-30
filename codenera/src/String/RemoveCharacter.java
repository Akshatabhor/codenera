package String;

import java.util.Scanner;

public class RemoveCharacter {

    public static String removeCharacter(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        System.out.println("Enter the character to remove:");
        char ch = sc.next().charAt(0);

        String result = removeCharacter(input, ch);
        System.out.println("String after removing '" + ch + "': " + result);

      
    }
}
