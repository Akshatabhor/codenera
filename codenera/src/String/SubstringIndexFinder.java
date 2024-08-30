package String;

import java.util.Scanner;

public class SubstringIndexFinder
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mainstring String");
		String mainstring=sc.nextLine();
		System.out.println("enter the substring String");
		String substring=sc.nextLine();
		
		int indexOfSubstring = findFirstOccurrence(mainstring, substring);

        if (indexOfSubstring != -1) 
        {
            System.out.println("The substring '" + substring + "' first occurs at index: " + indexOfSubstring);
        } 
        else 
        {
            System.out.println("The substring '" + substring + "' does not occur in the string.");
        }

       
    }

    public static int findFirstOccurrence(String mainString, String substring)
    {
        return mainString.indexOf(substring);
    }

}

