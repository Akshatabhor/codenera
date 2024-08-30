package String;

import java.util.Scanner;

public class CheckDigits {

    public static boolean containsOnlyDigits(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        if (containsOnlyDigits(input)) {
            System.out.println("The string contains only numeric digits.");
        } else {
            System.out.println("The string does not contain only numeric digits.");
        }

        sc.close();
    }
}
