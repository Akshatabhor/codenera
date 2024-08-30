/*10. Write a program that takes in a string and removes all consecutive duplicates (leaves
only one instance of each character).*/

package String;

import java.util.Scanner;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			cnt=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				System.out.println(str.charAt(i));
			}
		}
		
	}

}
