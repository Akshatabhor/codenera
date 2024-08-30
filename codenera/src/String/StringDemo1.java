/* Input : Geeks$For$Geeks
Output : String is not accepted.
Input : Geeks For Geeks
Output : String is accepted*/

package String;

public class StringDemo1 
{

	public static void main(String[] args) 
	{
		String s1="Geeks For Geeks";
		if(s1.contains("$"))
		{
			System.out.println("String not excepted");
		}
		else
		{
			System.out.println("string excepeted");
		}
	}

}
