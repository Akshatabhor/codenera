package String;

import java.util.Scanner;

public class StringMethodReverse {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		
		char c[]=new char[str.length()];
		//System.out.println("reverse String:");
		int ind=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			c[ind]=str.charAt(i);
			ind++;
		}
		//for(int i=0;i<str.length();i++)
		//{
			//System.out.println(c[i]);
		//}
		//new string method to print reverse
		 String rev=new String(c);
			System.out.println("reverse String:"+rev);

	}

}
