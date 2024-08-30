/*15. Write a program that takes in a string and capitalises the first letter of each word.*/

package String;

import java.util.Scanner;

public class FirstLatterIsCapital 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.nextLine();
		
		
		String s[]=str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			char s1=(s[i].charAt(0));
			char capitalchar =Character.toUpperCase(s1);
			String capitalWord=capitalchar+s[i].substring(1);
			System.out.println(capitalWord);
		}
	
	}

}
