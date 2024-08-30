/*5. Write a program that takes in two strings and checks if they are anagrams (contain
the same letters in different order).

*/

package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramstr1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two String:");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		char s1[]=str1.toCharArray();
		char s2[]=str2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		String s3=new String(s1);
		String s4=new String(s2);
		
		if(s3.equals(s4))
		{
			System.out.println("string is anagram");
		}
		else
		{
			System.out.println("string is not anagram");

		}
	}

}
