package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramstr
{
	public static void checkAnagram()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two string:");
		String str1=sc.next();
		String str2=sc.next();
		
		char  sortc[]=str1.toCharArray();
		char sortc1[]=str2.toCharArray();
		
		System.out.println(Arrays.toString(sortc));
		System.out.println(Arrays.toString(sortc1));
		
		String s1=new String(sortc);
		String s2=new String(sortc1);
		
		if(s1.equals(s2))
		{
			System.out.println("Anagram String");
		}
		else
		{
			System.out.println("not Anagram String");
		}

		
	}
	public char[] SortCharArr(char c[])
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char t=c[i];
					c[i]=c[j];
					c[j]=t;
				}
			}
		}
		return c;
	}
	public static void main(String []args)
	{
		checkAnagram();
	}
}
