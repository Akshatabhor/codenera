package String;

import java.util.Scanner;

public class StringMethodFirstCharIsVoewl {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
		
			char c=s[i].charAt(0);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				System.out.println( "first char is vowel :"+s[i]);
			}
			
		}
	}

}
