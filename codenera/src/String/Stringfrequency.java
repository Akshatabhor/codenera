package String;

import java.util.Scanner;

public class Stringfrequency {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
        char ch[] = str.toCharArray();    

		for(int i=0;i<str.length();i++)
		{
			int c=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0')
			{
				System.out.println(ch[i] +  "count : " +c);
			}
		}
		
		}
	}


