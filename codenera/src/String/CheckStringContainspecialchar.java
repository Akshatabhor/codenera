package String;
import java.util.Scanner;
public class CheckStringContainspecialchar {

	 public static boolean checkContainsSpecialCharacter(String str)
	 {
		 char ch[]=str.toCharArray();
	        for (int i = 0; i < str.length(); i++) 
	        {
	            if (!Character.isLetterOrDigit(ch[i]) && !Character.isWhitespace(ch[i]))
	            {
	                return true; 
	            }
	        }
	        return false; 
	    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter STring");
		String str=sc.nextLine();
		
			if(checkContainsSpecialCharacter(str))
			{
				System.out.println("Given String Contains Special Character");
			}
			else 
			{
				System.out.println("Given String not Contains Special Character");

			}
		}
			
	
}
