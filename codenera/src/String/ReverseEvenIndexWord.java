package String;

import java.util.Scanner;

public class ReverseEvenIndexWord {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		/*even index word
		 * String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			if(i%2==0)
			{
				s[i]=new StringBuilder(s[i]).reverse().toString();
			}
		}
		String result=String.join(" ", s);
		System.out.println("modified String:"+result);*/
		
		/*odd index word*/
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			if(i%2==1)
			{
				s[i]=new StringBuilder(s[i]).reverse().toString();
			}
		}
		String result=String.join(" ", s);
		System.out.println("modified String:"+result);
	}

}
