/*13. Write a program that takes in a string and checks if it is a valid URL.*/

package String;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

	public class ValidUrl 
	{

	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a URL: ");
	        String url = scanner.nextLine();
	        
	        boolean isValid = isValidURL(url);
	        
	        if (isValid) 
	        {
	            System.out.println("The URL is valid.");
	        } 
	        else 
	        {
	            System.out.println("The URL is not valid.");
	        }
	        
	        
	    }
	    
	    public static boolean isValidURL(String url) 
	    {
	        if (url == null || url.isEmpty()) {
	            return false;
	        }
	        
	        String urlRegex = "^(https?|ftp)://[^\s/$.?#].[^\s]*$";
	        
	        Pattern pattern = Pattern.compile(urlRegex);
	        
	        Matcher matcher = pattern.matcher(url);
	        
	        return matcher.matches();
	    }
	}


