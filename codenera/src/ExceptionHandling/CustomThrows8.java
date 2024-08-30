/*Question 5:
Write a Java program that asks the user to input two numbers. 
Handle the possible exception that may occur if the user enters a non-numeric value, 
such as a string, instead of a number. 
*/

package ExceptionHandling;
import java.util.Scanner;
public class CustomThrows8 {

	
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter the first number: ");
	            String s1 = scanner.nextLine();
	            double number1 = Double.parseDouble(s1);
	            
	            System.out.print("Enter the second number: ");
	            String s2 = scanner.nextLine();
	            double number2 = Double.parseDouble(s2);
	            
	            System.out.println("The sum of the two numbers is: " + (number1 + number2));
	        }
	        catch (NumberFormatException e) 
	        {
	            System.err.println("Invalid input");
	        } 
	        finally 
	        {
	        	System.out.println("main completed");
	        }
	    }
	}


