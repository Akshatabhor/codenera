package String;

import java.util.Scanner;

public class StringMethodRemoveRepetedCharacter {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int c=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.println(ch[i]);
			}
		}
	}

}
