package String;

import java.util.Scanner;

public class StringMethodAsendingdcending {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()>s[j].length())
				{
					String t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
		}
		System.out.println("asending order:");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+" ");
		}
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()<s[j].length())
				{
					String t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
		}
		System.out.println("decending order:");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+" ");
		}
	}

}
