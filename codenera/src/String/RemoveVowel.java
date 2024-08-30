/*6. Write a program that takes in a string and removes all the vowels from it.*/

package String;
import java.util.Scanner;
public class RemoveVowel 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter STring");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			 if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
		                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')
			{
			System.out.print(ch);
			}	
			
		
	}

	}

}
