/*. Write a Java program to create a method that takes a
 
 * string as input and throws an exception if the 
 * string does not contain vowels.
*/

package ExceptionHandling;
class NoVowelException extends Exception
{
	NoVowelException(String msg)
	{
		super(msg);
	}
}public class CustomThrows5
{
	
	public void checkForVowels() throws NoVowelException 
	{
		String str="bcd";
		if (str == null || !str.matches(".*[AEIOUaeiou].*")) 
		{
		   throw new NoVowelException("The string does not contain any vowels:"+str);
		 } 
		else 
		{
		   System.out.println("The string contains vowels.");
		}
		    }
	
	public static void main(String[] args) 
	{
		CustomThrows5 obj=new CustomThrows5();
		try
		{
			obj.checkForVowels();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
