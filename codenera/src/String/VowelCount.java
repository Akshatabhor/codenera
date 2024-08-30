/*2. Write a program that takes in a string and counts the number of vowels in it.*/

package String;
import java.util.Scanner;
public class VowelCount {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		int cnt = 0;
		for(int i = 0;i < str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				cnt++;
			}
		}
		System.out.println("count of vowel of string:"+cnt);


	}

}
