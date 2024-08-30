/*19. Write a program that takes in a string and returns the second most frequent character
in it.*/

package String;

import java.util.Scanner;

public class SecondMostFrequentCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		int max=0;
		int secmax=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>max)
			{
				secmax=max;
				max=c[i];
			}
			else if(c[i]>secmax && c[i]!=max)
			{
				secmax=max;
			}
		}
		System.out.println("second most frequent character:"+secmax);
	}
}
