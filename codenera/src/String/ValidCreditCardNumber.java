/*20. Write a program that takes in a string and checks if it is a valid credit card number
*/
package String;
import java.util.Scanner;

	public class ValidCreditCardNumber
	{

	    public static boolean isValidCreditCard(String cardNumber) 
	    {
	        cardNumber = cardNumber.replaceAll("\\D", "");

	        int n = cardNumber.length();
	        if (n < 13 || n > 19) {
	            return false;
	        }

	        int sum = 0;
	        boolean alternate = false;
	        for (int i = n - 1; i >= 0; i--) {
	            int digit = cardNumber.charAt(i) - '0';

	            if (alternate) {
	                digit *= 2;
	                if (digit > 9) {
	                    digit = (digit % 10) + 1;
	                }
	            }

	            sum += digit;
	            alternate = !alternate;
	        }

	        return (sum % 10 == 0);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the credit card number:");
	        String cardNumber = sc.nextLine();

	        if (isValidCreditCard(cardNumber)) {
	            System.out.println(cardNumber + " is a valid credit card number.");
	        } else {
	            System.out.println(cardNumber + " is not a valid credit card number.");
	        }
	    }
	}



