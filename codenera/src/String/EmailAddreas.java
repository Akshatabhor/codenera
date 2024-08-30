/*12. Write a program that takes in a string and checks if it is a valid email address.
{*/

package String;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

	public class EmailAddreas 
	{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter an email address: ");
	        String email = scanner.nextLine();
	        
	        boolean isValid = isValidEmail(email);
	        
	        if (isValid) 
	        {
	            System.out.println("The email address is valid.");
	        } 
	        else 
	        {
	            System.out.println("The email address is not valid.");
	        }
	    }
	    
	    public static boolean isValidEmail(String email) 
	    {
	        if (email == null || email.isEmpty())
	        {
	            return false;
	        }
	        
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	        
	        Pattern pattern = Pattern.compile(emailRegex);
	        
	        Matcher matcher = pattern.matcher(email);
	        
	        return matcher.matches();
	    }
	}


