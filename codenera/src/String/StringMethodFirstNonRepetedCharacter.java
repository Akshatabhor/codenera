/*9. Write a program that takes in a string and finds the first non-repeating character in it.*/

package String;

import java.util.Scanner;

public class StringMethodFirstNonRepetedCharacter {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			int c=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.println("first non repeting character:"+str.charAt(i));
				break;
			}
					
		}
	}

}
