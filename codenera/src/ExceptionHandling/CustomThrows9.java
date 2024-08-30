/*Q4 Create a user authentication system with a method that checks if a user's credentials 
(e.g., username and password) are valid. If the credentials are incorrect, 
throw a custom exception AuthenticationException with a message indicating authentication failure.
*/

package ExceptionHandling;
import java.util.Scanner;
class AuthenticationFailedException extends Exception{
    public AuthenticationFailedException(String str){
        super(str);
    }
}
public class CustomThrows9 
{
	
	    public final static String  user="user@name";
	    private final static String  pass="pass@123";
	    public static void main(String[] args) throws AuthenticationFailedException {
	        Scanner s=new Scanner(System.in);

	        System.out.println("You have 3 Chance :");
	        int i=0;
	        while (i!=3){
	            System.out.println("Enter your UserName:");
	            String user1 =s.nextLine();
	            System.out.println("Enter your Password: ");
	            String pass1=s.nextLine();
	            System.out.println("-------------------");
	            if( user1.equals(user) && pass1.equals(pass)){
	                System.out.println("Loging Succesfull !");
	                break;
	            }
	            i++;
	        }
	        System.out.println(i);
	        try {
	            if (i==3){
	                throw new AuthenticationFailedException("Authentication Failed !");
	            }
	        }catch (Exception e){
	            System.out.println(e);
	        }
	    }
	}

