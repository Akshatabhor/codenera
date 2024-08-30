package String;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidPhoneNumber 
{
	 private static final String PHONE_NUMBER_PATTERN = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Please enter a phone number:");
	        String input = scanner.nextLine();

	        if (isValidPhoneNumber(input)) 
	        {
	            System.out.println("The phone number is valid.");
	        } else {
	            System.out.println("The phone number is invalid.");
	        }

	        
	    }

	    public static boolean isValidPhoneNumber(String phoneNumber) 
	    {
	        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
	        Matcher matcher = pattern.matcher(phoneNumber);
	        return matcher.matches();
	    }
	}

