package String;

import java.util.Scanner;

public class StringMethodCharEvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		
		System.out.println("character at even position : ");
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				System.out.println("positon of :"+i+":" +str.charAt(i));
			}
		}
	

		System.out.println("character at odd position : ");
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				System.out.println("positon of :"+i+":" +str.charAt(i));
			}
		}
		
	}

}
